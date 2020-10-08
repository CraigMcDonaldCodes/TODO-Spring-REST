package codes.mcdonald.craig.todomvc.models;

import javax.persistence.Entity;

import java.time.ZonedDateTime;

@Entity
public class Entry {

	private String description;
	private ZonedDateTime dateCreated;
}
