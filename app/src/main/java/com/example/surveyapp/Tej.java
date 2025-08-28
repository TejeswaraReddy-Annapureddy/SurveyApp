package com.example.surveyapp;

public class tej {
    private int ivImageId;
    private String t;
    private String st;
    public tej( String t, String st,int ivImageId) {
        this.ivImageId = ivImageId;
        this.t = t;
        this.st = st;
    }
    public int getNumbersImageId() {
        return ivImageId;
    }
    public String getNumberInDigit() {
        return t;
    }
    public String getNumbersInText() {
        return st;
    }
}
