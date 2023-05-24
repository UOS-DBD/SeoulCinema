package com.dbd.seoulcinema.domain.entity;

import com.dbd.seoulcinema.domain.enumeration.ScreeningStatus;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MOVIE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Movie {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MOVIE_NUMBER")
    private Long movieMovie;

    @Column(name = "MOVIE_NAME", length = 30)
    private String movieName;

    @Column(name = "RUNNING_TIME", length = 5)
    private String runningTime;

    //TODO(영화장르코드,영화등급코드)

    @Column(name = "MOVIE_INTRODUCTION", length = 256)
    private String movieIntroduction;

    @Column(name = "MOVIE_IMAGE", length = 70)
    private String movieImage;

    @Column(name = "SCREENING_STATUS", length = 2)
    private ScreeningStatus screeningStatus;
}
