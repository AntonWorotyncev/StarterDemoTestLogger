package com.test.starterdemotestlogger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/test")
@Tag(name = "StartDemoTestLogger", description = "Тестовый котроллер для проверки стартера SpringStarterHttpLogger")
public class TestStarterHttpLoggerController {

    @Operation(summary = "Простой GET - запрос, возвращающий дефолтную строку",
            description = "Возвращает строку, с содержимым This is GET response!")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешный запрос"),
    })
    @GetMapping("/getDefaultString")
    public ResponseEntity<String> getExample() {
        String response = "This is GET response!";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "Простой POST - запрос, возвращающий дефолтную строку",
            description = "Возвращает строку, с содержимым \"You sent: \" + {Переданное тело}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешный запрос"),
    })
    @PostMapping("/postTestExample")
    public ResponseEntity<String> postExample(@RequestBody String requestBody) {
        String response = "You sent: " + requestBody;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}