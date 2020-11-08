package codes.mcdonald.craig.todorest.repository;

import org.springframework.data.repository.CrudRepository;

import codes.mcdonald.craig.todorest.model.Entry;

public interface TodoRepository extends CrudRepository<Entry, Long> {
}
