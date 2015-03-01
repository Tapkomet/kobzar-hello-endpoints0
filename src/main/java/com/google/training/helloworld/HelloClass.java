package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name, String period) {
    	if(period==null){
    		this.message = ("Hello " + name + "!");
    	}
    	else{
        this.message = ("Hello " + name + ", your period: "+ period);
    	}
    	}

    public String getMessage() {
        return message;
    }
}
