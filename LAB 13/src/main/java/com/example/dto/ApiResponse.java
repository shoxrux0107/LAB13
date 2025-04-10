package com.example.LAB13.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class ApiResponse<T> {
    @JsonProperty("api_result")
    private T result;

    @JsonProperty("api_timestamp")
    private LocalDateTime timestamp;

    @JsonProperty("api_version")
    private String version;

    public ApiResponse(T result) {
        this.result = result;
        this.timestamp = LocalDateTime.now();
        this.version = "1.0";
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}