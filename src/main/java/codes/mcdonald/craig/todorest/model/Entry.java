package codes.mcdonald.craig.todorest.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 200)
	private String description;

	@Column(name = "date_created")
	private ZonedDateTime dateCreated;

	@Column(name = "date_completed")
	private ZonedDateTime dateCompleted;

}