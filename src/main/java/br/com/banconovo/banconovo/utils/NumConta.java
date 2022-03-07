package br.com.banconovo.banconovo.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = NumContaValidator.class)
public @interface NumConta {
  String mensage()default "Numero da conta inválido";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
  String value() default "";
}
