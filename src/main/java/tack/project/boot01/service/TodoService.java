package tack.project.boot01.service;

import jakarta.transaction.Transactional;

import tack.project.boot01.dto.PageResponseDTO;
import tack.project.boot01.dto.TodoDTO;


@Transactional
public interface TodoService {
    
    ////////////////////////////////////
    PageResponseDTO<TodoDTO> getList();

    ////////////////////////////////////
    TodoDTO register(TodoDTO dto);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO dto);

}
