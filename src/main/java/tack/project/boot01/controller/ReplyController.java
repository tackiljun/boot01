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
import tack.project.boot01.dto.ReplyDTO;
import tack.project.boot01.dto.ReplyPageRequestDTO;
import tack.project.boot01.service.ReplyService;


@CrossOrigin
@RestController
@RequestMapping("/api/replies")
@RequiredArgsConstructor
@Log4j2
public class ReplyController {

    ///////////////////////////////////////////////////////////////////////
    private final ReplyService replyService;

    ///////////////////////////////////////////////////////////////////////
    @GetMapping("/{bno}/list")
    public PageResponseDTO<ReplyDTO> list(
    @PathVariable("bno") Long bno, 
    ReplyPageRequestDTO requestDTO) {

        log.info("bno....." + bno);
        log.info(requestDTO);

        try {
            PageResponseDTO<ReplyDTO> result =  replyService.list(requestDTO);

            log.info(result);

            return result;

        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    ///////////////////////////////////////////////////////////////////////
    @PostMapping("/")
    public Map<String, Long> register( @RequestBody ReplyDTO replyDTO) {

        log.info("----------ReplyController----------");
        log.info(replyDTO);

        Long newRno = replyService.register(replyDTO);

        return Map.of("result", newRno);

    }

    ///////////////////////////////////////////////////////////////////////
    @GetMapping(value = "/{rno}")
    public ReplyDTO get(@PathVariable("rno") Long rno) {

        return replyService.read(rno);

    }

    ///////////////////////////////////////////////////////////////////////
    @DeleteMapping("/{rno}")
    public Map<String, Long> remove(@PathVariable("rno") Long rno) {

        replyService.remove(rno);

        return Map.of("result", rno);

    }

    ///////////////////////////////////////////////////////////////////////
    @PutMapping("/{rno}")
    public Map<String, Long> modify(@RequestBody ReplyDTO replyDTO) {

        replyService.modify(replyDTO);

        return Map.of("result", replyDTO.getRno());

    }
    
}
