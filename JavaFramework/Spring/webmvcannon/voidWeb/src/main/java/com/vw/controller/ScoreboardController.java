package com.vw.controller;

import com.vw.dto.ScoreboardDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Map;

@Controller
public class ScoreboardController {
    @RequestMapping("/score-board.htm")
    public void showScoreboard(final Map<String, Object> map){
        final ScoreboardDto dto = ScoreboardDto.of()
                .tournamentName("India vs Australia")
                .matchDate(LocalDate.now())
                .venue("Eden Garden, Kolkata")
                .team1Name("India")
                .team2Name("Australia")
                .team1Score("267 (50 Overs)")
                .team2Score("260 (50 Overs)")
                .result("India won by 7 runs").build();
        map.put("scoreboard", dto);
    }
}
