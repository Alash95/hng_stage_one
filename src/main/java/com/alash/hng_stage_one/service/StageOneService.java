package com.alash.hng_stage_one.service;


import com.alash.hng_stage_one.dto.response.StageOneResponse;

public interface StageOneService {
    StageOneResponse GetData(String slackName, String track);
}
