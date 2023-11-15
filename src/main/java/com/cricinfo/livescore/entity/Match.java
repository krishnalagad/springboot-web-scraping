package com.cricinfo.livescore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "cricket_match")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    // set the match status according to textComplete
    public void setMatchStatus() {
        if (textComplete.isBlank())
            this.status = MatchStatus.LIVE;
        else
            this.status = MatchStatus.COMPLETED;
    }
}