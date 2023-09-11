package tack.project.boot01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tack.project.boot01.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
