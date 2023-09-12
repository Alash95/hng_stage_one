package com.alash.hng_stage_one.controller;

import com.alash.hng_stage_one.dto.response.StageOneResponse;
import com.alash.hng_stage_one.service.StageOneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class StageOneController {
    private final StageOneService stageOneService;
    @GetMapping
    public StageOneResponse GetDataResponse(@RequestParam(name = "slack_name") String slackName,
                                            @RequestParam(name = "track")String track) {
       return stageOneService.GetData(slackName, track);
    }


}
