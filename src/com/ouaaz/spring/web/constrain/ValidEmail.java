package com.ouaaz.spring.web.constrain;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = com.ouaaz.spring.web.constrain.ValidEmailImpl.class)
@Documented
public @interface ValidEmail {

    String message() default "Invalid email adresse format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    int min () default 5; 
    
 

}