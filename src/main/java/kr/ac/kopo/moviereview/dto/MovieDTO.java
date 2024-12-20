package kr.ac.kopo.moviereview.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
    private Long mno;
    private String title;
    //영화의 평균 평점
    private double avg;
    //리뷰 수 jpa의 count( )
    private int reviewCnt;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}