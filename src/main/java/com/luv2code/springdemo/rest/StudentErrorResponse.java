package com.luv2code.springdemo.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

}
