package com.kagzz.jmix.rys.order.validation;

import com.kagzz.jmix.rys.order.entity.OrderLine;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidRentalPeriodValidator implements ConstraintValidator<ValidRentalPeriod, OrderLine> {

    @Override
    public boolean isValid(OrderLine orderLine, ConstraintValidatorContext context) {
        if (orderLine == null) {
            return false;
        }

        if (orderLine.getStartsAt() == null || orderLine.getEndsAt() == null) {
            return false;
        }

        return orderLine.getStartsAt().isBefore(orderLine.getEndsAt());
    }
}