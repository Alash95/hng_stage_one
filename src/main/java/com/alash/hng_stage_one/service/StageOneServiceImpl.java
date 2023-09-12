package com.alash.hng_stage_one.service;

import com.alash.hng_stage_one.dto.response.StageOneResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class StageOneServiceImpl implements StageOneService{

    private final static String GITHUB_FILE_URL = "";
    private final static String GITHUB_REPO_URL = "https://github.com/Alash95/hng_stage_one.git";

    @Override
    public StageOneResponse GetData(String slackName, String track) {LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String formattedDateTime = localDateTime.format(formatter);

        String dayOfWeek = LocalDate.now().getDayOfWeek().toString();
        String capitalizedDayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1).toLowerCase();

        return StageOneResponse.builder()
                .currentDay(capitalizedDayOfWeek)
                .track(track)
                .utcTime(formattedDateTime)
                .slackName(slackName)
                .statusCode(HttpStatus.OK.value())
                .githubFileUrl(GITHUB_FILE_URL)
                .githubRepoUrl(GITHUB_REPO_URL)
                .build();
    }
}
