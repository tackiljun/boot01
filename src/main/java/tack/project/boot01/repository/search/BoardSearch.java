package tack.project.boot01.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import tack.project.boot01.domain.Board;
import tack.project.boot01.dto.BoardListRcntDTO;
import tack.project.boot01.dto.PageRequestDTO;
import tack.project.boot01.dto.PageResponseDTO;


public interface BoardSearch {

    ////////////////////////////////////////////////////////////////////////////////////
    // 1. 메소드를 추가한다. 
    // 검색하는 용도.
    // V1.
    Page<Board> search1(String searchType, String keyword, Pageable pageable);

    ////////////////////////////////////////////////////////////////////////////////////
    // V2.
    Page<Object[]> searchWithRcnt(String searchType, String keyword, Pageable pageable);

    ////////////////////////////////////////////////////////////////////////////////////
    // V3.
    PageResponseDTO<BoardListRcntDTO> searchDTORcnt(PageRequestDTO requestDTO);

    ////////////////////////////////////////////////////////////////////////////////////
    default Pageable makePageable(PageRequestDTO requestDTO) {

        Pageable pageable = PageRequest.of(
            requestDTO.getPage() -1,
            requestDTO.getSize(),
            Sort.by("bno").descending());

        return pageable;

    }
    
}
