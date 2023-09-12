package tack.project.boot01.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import tack.project.boot01.dto.PageResponseDTO;
import tack.project.boot01.dto.TodoDTO;
import tack.project.boot01.service.TodoService;


@CrossOrigin
@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
@Log4j2
public class TodoController {

    ///////////////////////////////////////////////////////////////////
    private final TodoService todoService;

    ///////////////////////////////////////////////////////////////////
    @GetMapping("/list")
    public PageResponseDTO<TodoDTO> list() {

        return todoService.getList();

    }

    ///////////////////////////////////////////////////////////////////
    @GetMapping("/{tno}")
    public TodoDTO get(@PathVariable Long tno) {

        return todoService.getOne(tno);

    }

    ///////////////////////////////////////////////////////////////////
    @PostMapping("/")
    public TodoDTO register(@RequestBody TodoDTO todoDTO) {

        log.info("----------register----------");
        log.info(todoDTO);

        return todoService.register(todoDTO);

    }

    ///////////////////////////////////////////////////////////////////
    @DeleteMapping("/{tno}")
    public Map<String, String> delete(@PathVariable("tno") Long tno) {

        todoService.remove(tno);

        return Map.of("result", "success");

    }

    ///////////////////////////////////////////////////////////////////
    @PutMapping("/{tno}")
    public Map<String, String> update(
        @PathVariable("tno") Long tno, 
        @RequestBody TodoDTO todoDTO) {

        todoDTO.setTno(tno); // 안전장치.
        todoService.modify(todoDTO);

        return Map.of("result", "success");

    }
    
}
