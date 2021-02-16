package codes.mcdonald.craig.todorest;

import java.time.ZonedDateTime;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import codes.mcdonald.craig.todorest.model.Entry;
import codes.mcdonald.craig.todorest.repository.TodoRepository;

@SpringBootTest
@Transactional
class TodoSpringMvcApplicationTests {

	@Autowired
	private TodoRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	void hibernateCreatesInitialDatabaseEntries() {

		var entries = repository.findAll();
		Assertions.assertEquals(4, entries.size());
	}

	@Test
	void testAddingOneNewEntryInInitialDatabase() {

		var entry = new Entry();
		entry.setDescription("Create a test for basic TODO web application in Spring Boot");
		entry.setDateCreated(ZonedDateTime.now());

		repository.saveAndFlush(entry);

		var entries = repository.findAll();

		Assertions.assertEquals(5, entries.size());
	}

	@Test
	void testAddingFourNewEntryInInitialDatabase() {

		var entry1 = new Entry();
		entry1.setDescription("Read Java Concurrency in Practice");
		entry1.setDateCreated(ZonedDateTime.now());

		var entry2 = new Entry();
		entry2.setDescription("Read The Well Grounded Java Developer");
		entry2.setDateCreated(ZonedDateTime.now());

		var entry3 = new Entry();
		entry3.setDescription("Read Real World Software Development");
		entry3.setDateCreated(ZonedDateTime.now());

		var entry4 = new Entry();
		entry4.setDescription("Read Spring Security in Action");
		entry4.setDateCreated(ZonedDateTime.now());

		List.of(entry1, entry2, entry3, entry4)
			.stream()
			.forEach(e -> repository.save(e));

		repository.flush();

		var entries = repository.findAll();

		Assertions.assertEquals(8, entries.size());
	}
}