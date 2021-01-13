package codes.mcdonald.craig.todorest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import codes.mcdonald.craig.todorest.repository.TodoRepository;

@SpringBootTest
class TodoSpringMvcApplicationTests {
	
	@Autowired
	private TodoRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	void hibernateCreatesInitialDatabaseEntries() {
		
		var entries = repository.findAll();
		Assertions.assertEquals(entries.size(), 4);
	}
}
