package codes.mcdonald.craig.todorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import codes.mcdonald.craig.todorest.model.Entry;
import codes.mcdonald.craig.todorest.repository.TodoRepository;

@RestController
public class ActionController {
	
	@Autowired
	private TodoRepository repository;

	////////////////////////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/api/entries")
	public List<Entry> getEntries() {
		
		return repository.findAll();
	}
	

	////////////////////////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/api/entry/{?}")
	public Entry getEntry() {
		
		// TODO: Complete implementation

		return new Entry();
	}
	

	////////////////////////////////////////////////////////////////////////////////////////////////////
	@PostMapping("/api/create")
	public Entry createEntry() {
		
		// TODO: Complete implementation

		return new Entry();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping(method = RequestMethod.PUT, path = "/api/update")
	public Entry updateEntry() {

		// TODO: Complete implementation
		
		return new Entry();
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	@DeleteMapping("/api/delete")
	public Entry deleteEntry() {
		
		// TODO: Complete implementation
		
		return new Entry();
	}
}