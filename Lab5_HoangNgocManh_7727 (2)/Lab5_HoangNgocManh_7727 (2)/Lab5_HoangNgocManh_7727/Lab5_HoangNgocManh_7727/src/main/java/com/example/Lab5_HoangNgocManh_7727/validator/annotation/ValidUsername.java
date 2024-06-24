package com.example.Lab5_HoangNgocManh_7727.validator.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import com.example.Lab5_HoangNgocManh_7727.validator.ValidUsernameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public @interface ValidUsername {
    String message() default "Username already exists";
    Class<?>[] groups() default {};
    Class<? extends Payload[]>[] payload() default {};
}
