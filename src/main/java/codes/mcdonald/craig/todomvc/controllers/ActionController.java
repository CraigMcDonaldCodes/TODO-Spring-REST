package codes.mcdonald.craig.todomvc.controllers;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import codes.mcdonald.craig.todomvc.models.Entry;

@RestController
public class ActionController {

	@GetMapping("/api/entries")
	public List<Entry> getEntries() {
		
		var list = new ArrayList<Entry>();
		var entry = new Entry();

		entry.setDescription("Finish TODO web site");
		entry.setDateCreated(ZonedDateTime.now());
		
		list.add(entry);
		
		return list;
	}
}