package org.example.schoolmanagementsystem.exceptions;

public class UserExistsException extends RuntimeException{

    public UserExistsException(String message){
        super(message);

    }
}
