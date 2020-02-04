package com.nous.project.template.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.nous.project.template.exception.ProductNotPurchased;
import com.nous.project.template.exception.UnauthorisedAccess;
import com.nous.project.template.exception.response.ApiResponse;


@ControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler(ProductNotPurchased.class)
    public ResponseEntity<ApiResponse> productNotPurchased(ProductNotPurchased ex) {
    	ApiResponse apiResponse=new ApiResponse (new Date(),HttpStatus.NOT_FOUND,5002,ex.getMessage());
    	 return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(UnauthorisedAccess.class)
    public  ResponseEntity<ApiResponse> unauthorisedAccess(UnauthorisedAccess ex) {
    	ApiResponse apiResponse=new ApiResponse (new Date(),HttpStatus.NETWORK_AUTHENTICATION_REQUIRED,5003,ex.getMessage());
    	return  new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    	
    }
}
