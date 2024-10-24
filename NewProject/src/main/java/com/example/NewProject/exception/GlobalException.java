package com.example.NewProject.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.NewProject.ErrBean;

@ControllerAdvice
public class GlobalException {

//	@ExceptionHandler(value = ArithmeticException.class)
//	public ResponseEntity<ErrBean> error(ArithmeticException e){
//		ErrBean err=new ErrBean();
//		err.setStatus("status failed!");
//		err.setReason(e.getMessage());
//		err.setMessage("failed!");
//		return new ResponseEntity<ErrBean>(err,HttpStatusCode.valueOf(300));
//	}
	
	
//	@ExceptionHandler(value=NullPointerException.class)
//    public ResponseEntity<ErrBean> error(NullPointerException e){
//		
//		ErrBean b = new ErrBean();
//		b.setStatus("status code failed");
//		b.setReason(e.getMessage());
//		b.setMessage("failed!");
//		return new ResponseEntity<>(b,HttpStatusCode.valueOf(300));
//	}
	
	@ExceptionHandler(value = CustomExceoption.class)
	public ResponseEntity<ErrBean> customExceoption(CustomExceoption e){
		
		ErrBean r = new ErrBean();
		r.setMessage(e.getMessage());
		r.setReason(e.getMessage());
		r.setStatus(e.getMessage());
		return new ResponseEntity<ErrBean>(r,HttpStatusCode.valueOf(300));
	}


}
