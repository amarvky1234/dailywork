package com.vw.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(builderMethodName = "of")
public class ScoreboardDto {
    private String tournamentName;
    private LocalDate matchDate;
    private String venue;
    private String team1Name;
    private String team2Name;
    private String team1Score;
    private String team2Score;
    private String result;
}
