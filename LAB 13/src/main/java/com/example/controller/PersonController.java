package com.example.webProg_lab13.controller;

import com.example.webProg_lab13.dto.PersonDTO;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @PostMapping("/person")
    public ResponseEntity<PersonDTO> processPerson(@Valid @RequestBody PersonDTO personRequestDTO) {
        // Log the deserialized object
        logger.info("Received person data: {}", personRequestDTO);

        // Process the request (in a real application, you would do something with the data)
        return ResponseEntity.ok(personRequestDTO);
    }
}