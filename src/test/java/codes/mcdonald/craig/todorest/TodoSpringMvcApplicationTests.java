package codes.mcdonald.craig.todorest;

import java.time.ZonedDateTime;

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
}