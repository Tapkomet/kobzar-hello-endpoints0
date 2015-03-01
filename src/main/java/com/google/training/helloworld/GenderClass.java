package com.google.training.helloworld;

public class GenderClass {
    public String message;

    public GenderClass () {
    }

    public GenderClass (String gender) {
    	
        this.message = ("You are "+gender+", how nice");
    	
    	}

    public String getMessage() {
        return message;
    }
}
