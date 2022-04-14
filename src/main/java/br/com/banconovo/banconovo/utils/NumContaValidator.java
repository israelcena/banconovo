package br.com.banconovo.banconovo.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumContaValidator implements ConstraintValidator<NumConta, String> {

  @Override
  public void initialize(NumConta constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return false;
  }

}
