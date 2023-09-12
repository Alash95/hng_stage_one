package com.alash.hng_stage_one.entity;

//import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
//@Entity
//@Table(name = "stageOne")
public class StageOne {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false)
    private String slackName;

//    @Column(nullable = false)
    private String currentDay;

//    @Column(nullable = false)
    private String track;

//    @Column(nullable = false)
    private String githubFileUrl;

//    @Column(nullable = false)
    private String githubRepoUrl;

//    @Column(nullable = false)
    private int statusCode;

}
