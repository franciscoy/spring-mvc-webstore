package com.fyllera.webstore.validator;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryValidator implements
		ConstraintValidator<Category, String> {
	
	private List<String> validCategories;
	
	public CategoryValidator() {
		validCategories = new ArrayList<String>();
		validCategories.add("Tablet");
		validCategories.add("Car");
		validCategories.add("Smart Phone");
		validCategories.add("Laptop");
	}
	
	public void initialize(Category constraintAnnotation) {}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		for (String category : this.validCategories) {
			if (value.equalsIgnoreCase(category)) {
				return true;
			}
		}
		
		return false;
	}

}
