package com.doordash.demo.webhook;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class DoorDashWebHook {
    private final ObjectMapper objectMapper;

    public DoorDashWebHook(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @PostMapping("/web")
    ResponseEntity<HttpStatus> testWebHook(@RequestBody DoorDashEvent event) throws JsonProcessingException {
        log.info("event recieved {}", objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(event));
        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }
}
