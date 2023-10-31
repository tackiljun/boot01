package tack.project.boot01.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReplyPageRequestDTO extends PageRequestDTO {

    ///////////////////////
    private Long bno;

    ///////////////////////
    @Builder.Default
    private int page = 1;
    @Builder.Default
    private int size = 10;
    
    ///////////////////////
    private boolean last;
    
}
