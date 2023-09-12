package tack.project.boot01.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardListRcntDTO {

    /////////////////////////////////////////////
    private Long bno;
    private String title;
    private String writer;
    //replyCount 변수명을 꼭 기억하자. 이따 쓸것.
    private long replyCount;

    /////////////////////////////////////////////
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime regDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modDate;
    
}
