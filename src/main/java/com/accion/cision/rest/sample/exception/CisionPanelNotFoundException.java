package com.accion.cision.rest.sample.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * @author al3205
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CisionPanelNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public CisionPanelNotFoundException(long panel_id) {
		super(String.format("Cision Panel is not found with id : '%s'", panel_id));
	}
}
