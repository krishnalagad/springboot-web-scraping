package com.cricinfo.livescore.controller;

import com.cricinfo.livescore.entity.Match;
import com.cricinfo.livescore.service.MatchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cric")
@CrossOrigin("*")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/all-matches")
    public ResponseEntity<List<Match>> getAllMatches() {
        List<Match> allMatches = this.matchService.getAllMatches();
        return ResponseEntity.ok(allMatches);
    }

    @GetMapping("/live-matches")
    public ResponseEntity<List<Match>> getLiveMatches() {
        List<Match> liveMatches = this.matchService.getLiveMatches();
        return ResponseEntity.ok(liveMatches);
    }

    @GetMapping("/point-table")
    public ResponseEntity<List<List<String>>> getPointTable() {
        List<List<String>> pointTable = this.matchService.getPointTable();
        return ResponseEntity.ok(pointTable);
    }
}