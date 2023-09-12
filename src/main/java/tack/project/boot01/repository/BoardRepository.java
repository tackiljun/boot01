package tack.project.boot01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tack.project.boot01.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    
}
