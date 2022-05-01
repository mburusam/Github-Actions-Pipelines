package com.sam.cicdpipelinesgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPipelinesGitHubActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to the coolstuffs of CICD";
    }
    public static void main(String[] args) {
        SpringApplication.run(CicdPipelinesGitHubActionsApplication.class, args);
    }

}
