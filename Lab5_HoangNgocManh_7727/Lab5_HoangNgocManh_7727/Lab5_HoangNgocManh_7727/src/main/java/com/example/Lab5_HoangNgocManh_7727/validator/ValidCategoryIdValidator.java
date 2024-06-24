package com.example.Lab5_HoangNgocManh_7727.validator;
import com.example.Lab5_HoangNgocManh_7727.entity.Category;
import com.example.Lab5_HoangNgocManh_7727.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }

}
