/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import java.util.List;

/**
 *
 * @author nafees
 */
public class SignupResponse {

    private String status;

    private Integer statuscode;
    
    private List<String> error;

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(Integer statuscode) {
        this.statuscode = statuscode;
    }

    public SignupResponse() {

    }

    public SignupResponse(String status, Integer statuscode) {
        this.status = status;
        this.statuscode = statuscode;
    }
    
    

}
