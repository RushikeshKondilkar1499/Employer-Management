package com.rushi.EmployerManagement.DTO;

import java.net.http.HttpClient;
import java.time.Instant;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.rushi.EmployerManagement.Model.Employer;

public class EmInquiryResponse {

    private String status;
    private HttpStatus code;
    private String message;
    private List<Employer> data;
    private Instant timestamp; // <-- New field

    public EmInquiryResponse() {
        this.timestamp = Instant.now(); // Sets the current time when object is created
    }

    // Getters and setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Employer> getData() {
        return data;
    }

    public void setData(List<Employer> data) {
        this.data = data;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    
    
}
