package com.accion.cision.rest.sample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * @param email
     */
    public UserNotFoundException(String email) {
        super(String.format("Cision User not found with email : '%s'", email));
    }
}
