package io.mosip.pmp.partnermanagement.core;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.mosip.pmp.partnermanagement.exception.ErrorResponse;

import lombok.Data;


/**
 * @author sanjeev.shrivastava
 *
 * @param <T> any type of object as a parameter
 */

@Data
public class ResponseWrapper<T> {
	public String id;
	public String version;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	public LocalDateTime responsetime = LocalDateTime.now(ZoneId.of("UTC"));
	public Object metadata;
	@NotNull
	@Valid
	public T response;

	public List<ErrorResponse> errors;

}
