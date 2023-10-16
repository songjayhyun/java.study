package org.example.exception;

public class OverDraftException extends Exception{

    public OverDraftException(String message) {
        super(message); // detail Message가 중요
    }
}
