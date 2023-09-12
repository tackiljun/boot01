package tack.project.boot01.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import tack.project.boot01.domain.Board;
import tack.project.boot01.dto.BoardDTO;
import tack.project.boot01.dto.BoardListRcntDTO;
import tack.project.boot01.dto.PageRequestDTO;
import tack.project.boot01.dto.PageResponseDTO;
import tack.project.boot01.repository.BoardRepository;


@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    ///////////////////////////////////////////////////////////////////////////////////
    private final BoardRepository boardRepository;
    private final ModelMapper modelMapper;

    ///////////////////////////////////////////////////////////////////////////////////
    @Override
    public PageResponseDTO<BoardListRcntDTO> listRcnt(PageRequestDTO pageRequestDTO) {
        
        log.info("==============================");
        log.info(pageRequestDTO);

        return boardRepository.searchDTORcnt(pageRequestDTO);

    }

    ///////////////////////////////////////////////////////////////////////////////////
    @Override
    public BoardDTO getOne(Long bno) {
        
        Optional<Board> result = boardRepository.findById(bno);

        Board board = result.orElseThrow();

        BoardDTO dto = modelMapper.map(board, BoardDTO.class);

        return dto;

    }
    
}
