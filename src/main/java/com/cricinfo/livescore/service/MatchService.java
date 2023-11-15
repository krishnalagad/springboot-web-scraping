package com.cricinfo.livescore.service;

import com.cricinfo.livescore.entity.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<Map<String, String>> getPointTable();
}