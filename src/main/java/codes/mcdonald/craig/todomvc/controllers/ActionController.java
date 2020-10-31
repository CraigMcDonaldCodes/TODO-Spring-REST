package codes.mcdonald.craig.todomvc.controllers;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import codes.mcdonald.craig.todomvc.models.Entry;

@RestController
public class ActionController {

	////////////////////////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/api/entries")
	public List<Entry> getEntries() {
		
		var list = new ArrayList<Entry>();
		var entry = new Entry();

		entry.setDescription("Finish TODO web site");
		entry.setDateCreated(ZonedDateTime.now());
		
		list.add(entry);
		
		return list;
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