package com.cricinfo.livescore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "cricket_match")
public class Match {

    private Integer matchId;
    private String teamHeading;
    private String matchNUmberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComplete;
    @Enumerated
    private MatchStatus status;
    private Date date = new Date();
}