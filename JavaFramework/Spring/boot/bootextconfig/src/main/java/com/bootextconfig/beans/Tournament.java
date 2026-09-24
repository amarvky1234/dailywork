package com.bootextconfig.beans;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Tournament {
    @Value("${tournamentNo}")
    private int tournamentNo;
    @Value("${homeTeam}")
    private String homeTeam;
    @Value("${awayTeam}")
    private String awayTeam;
}
