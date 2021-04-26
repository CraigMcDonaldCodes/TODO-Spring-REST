package codes.mcdonald.craig.todorest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import codes.mcdonald.craig.todorest.model.Entry;
import codes.mcdonald.craig.todorest.repository.TodoRepository;

@RestController
public class ActionController {
	
	@Autowired
	private TodoRepository repository;

	@GetMapping("/api/entries")
	public List<Entry> getEntries() {
		
		return repository.findAll();
	}
	
	@GetMapping("/api/entry/{?}")
	public Entry getEntry() {
		
		return new Entry();
	}
	
	@PostMapping("/api/create")
	public Entry createEntry(@RequestBody Entry entry) {
		
		return repository.save(entry);
	}
	
	@PutMapping("/api/update")
	public Entry updateEntry() {

		return new Entry();
	}
	
	@DeleteMapping("/api/delete/{id}")
	public Entry deleteEntry(@PathVariable("id" ) Long id) {
		
		Optional<Entry> entry = repository.findById(id);
		
		if (entry.isPresent()) {
			repository.deleteById(id);
			return entry.get();
		} else {
			return null;
		}
	}
}