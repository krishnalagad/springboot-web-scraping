package com.cricinfo.livescore.service.impl;

import com.cricinfo.livescore.entity.Match;
import com.cricinfo.livescore.repository.MatchRepository;
import com.cricinfo.livescore.service.MatchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public List<Match> getAllMatches() {
        return this.matchRepository.findAll();
    }

    @Override
    public List<Match> getLiveMatches() {
        return null;
    }

    @Override
    public List<Map<String, String>> getPointTable() {
        return null;
    }
}