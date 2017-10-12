package com.xinhnguyen.web.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidParamNumberConstraintValidator implements ConstraintValidator<ValidParamNumber, Long> {

    @Override
    public void initialize(ValidParamNumber paramConstraint) {
    }

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        // Perform param validation
        return !(value <= 0 || value > Long.MAX_VALUE);
    }

}

