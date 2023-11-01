package tack.project.boot01.service;

import org.springframework.transaction.annotation.Transactional;

import tack.project.boot01.dto.PageResponseDTO;
import tack.project.boot01.dto.ReplyDTO;
import tack.project.boot01.dto.ReplyPageRequestDTO;


@Transactional
public interface ReplyService {

    ////////////////////////////////////////////////////////////////
    // 모든 리스트 리턴 타입은 PageResponseDTO.
    PageResponseDTO<ReplyDTO> list(ReplyPageRequestDTO requestDTO);

    ////////////////////////////////////////////////////////////////
    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void remove(Long rno);

    void modify(ReplyDTO replyDTO);
    
}
