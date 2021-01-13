package codes.mcdonald.craig.todorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codes.mcdonald.craig.todorest.model.Entry;

public interface TodoRepository extends JpaRepository<Entry, Long> {
}
