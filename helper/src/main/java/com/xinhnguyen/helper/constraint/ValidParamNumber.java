package com.xinhnguyen.helper.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidParamNumberConstraintValidator.class)
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidParamNumber {

    String message() default "Must greater than 0 and lower than 2^63-1";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
