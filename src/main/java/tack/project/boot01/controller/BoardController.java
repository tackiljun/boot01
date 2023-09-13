package tack.project.boot01.controller;

import org.springdoc.core.annotations.ParameterObject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import tack.project.boot01.dto.BoardDTO;
import tack.project.boot01.dto.BoardListRcntDTO;
import tack.project.boot01.dto.PageRequestDTO;
import tack.project.boot01.dto.PageResponseDTO;
import tack.project.boot01.service.BoardService;


@CrossOrigin
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Log4j2
public class BoardController {

    ////////////////////////////////////////////////////////////////////////////////////////////
    private final BoardService boardService;

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping(value = "/list")
    public PageResponseDTO<BoardListRcntDTO> list(@ParameterObject PageRequestDTO requestDTO) {

        log.info(requestDTO);

        return boardService.listRcnt(requestDTO);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/{bno}")
    public BoardDTO get(@PathVariable("bno") Long bno) {

        return boardService.getOne(bno);

    }
    
}
