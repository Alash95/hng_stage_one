package com.alash.hng_stage_one.repository;

import com.alash.hng_stage_one.entity.StageOne;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StageOneRepository  {
    Optional<StageOne> findFirstBySlackNameAndTrack(String slackName, String track);
    boolean existsFirstBySlackNameAndTrack(String slackName, String track);
}
