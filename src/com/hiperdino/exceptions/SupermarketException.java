package com.hiperdino.exceptions;

public class SupermarketException extends RuntimeException {
    
    public SupermarketException(String message) {

        super("\t" + message);
    }
}
