package com.example.Lab5_HoangNgocManh_7727.validator;

import com.example.Lab5_HoangNgocManh_7727.entity.User;
import com.example.Lab5_HoangNgocManh_7727.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public void initialize(ValidUserId constraintAnnotation) {
        // Initialization logic if needed
    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null) {
            return true;
        }
        return user.getId() != null;
    }
}
