package com.textosql.demo.controller;

public class InvalidQueryException extends RuntimeException {
    public InvalidQueryException(String message){
        super(message);
    }
}
