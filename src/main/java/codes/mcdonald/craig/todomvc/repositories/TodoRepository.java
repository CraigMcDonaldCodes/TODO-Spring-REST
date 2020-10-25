package codes.mcdonald.craig.todomvc.repositories;

import org.springframework.data.repository.CrudRepository;

import codes.mcdonald.craig.todomvc.models.Entry;

public interface TodoRepository extends CrudRepository<Entry, Long> {
}
