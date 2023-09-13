package tack.project.boot01.service;

import jakarta.transaction.Transactional;

import tack.project.boot01.dto.BoardDTO;
import tack.project.boot01.dto.BoardListRcntDTO;
import tack.project.boot01.dto.PageRequestDTO;
import tack.project.boot01.dto.PageResponseDTO;


@Transactional
public interface BoardService {

    ///////////////////////////////////////////////////////////////////////////
    PageResponseDTO<BoardListRcntDTO> listRcnt (PageRequestDTO pageRequestDTO);

    BoardDTO getOne(Long bno);
    
}
