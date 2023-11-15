package com.cricinfo.livescore.repository;

import com.cricinfo.livescore.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    // custom method to get match by teamHeading
    Optional<Match> findByTeamHeading(String name);
}