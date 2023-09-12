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
public class BoardDTO {

    /////////////////////////////////////////////
    private Long bno;

    private String title;

    private String content;

    private String writer;

    /////////////////////////////////////////////
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDateTime regDate;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDateTime modDate;
    
}
