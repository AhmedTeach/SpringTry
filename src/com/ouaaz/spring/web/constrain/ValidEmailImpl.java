package com.ouaaz.spring.web.constrain;



import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;

public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String>{
	
	
	private int min ;
	
	@Override
	public void initialize(ValidEmail constrainAnnotation) {
		min = constrainAnnotation.min();
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext contextValid) {
		
		if (email.length()<min) return false;
		
		if(!EmailValidator.getInstance(false).isValid(email)) return false;
		return true;
	}

}
