package codes.mcdonald.craig.todomvc.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.ZonedDateTime;

@Entity
public class Entry {

	@Id
	private int id;
	private String description;
	private ZonedDateTime dateCreated;
	private ZonedDateTime dateCompleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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