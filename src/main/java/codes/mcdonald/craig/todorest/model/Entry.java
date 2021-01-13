package codes.mcdonald.craig.todorest.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ZonedDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(ZonedDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public ZonedDateTime getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(ZonedDateTime dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
}