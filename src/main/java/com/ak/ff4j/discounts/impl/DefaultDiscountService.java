package com.ak.ff4j.discounts.impl;

import com.ak.ff4j.discounts.DiscountService;
import com.ak.ff4j.discounts.model.HolidayPackage;
import org.ff4j.FF4j;
import org.ff4j.core.FlippingExecutionContext;
import org.springframework.beans.factory.annotation.Required;

public class DefaultDiscountService implements DiscountService
{
    private FF4j ff4j;

    @Override
    public boolean isEligibleForDiscount(HolidayPackage e)
    {
        return ff4j.check("holidays.discount.enabled");
    }

    @Override
    public boolean isEligibleForCustomisedDiscount(HolidayPackage e)
    {
        final FlippingExecutionContext fex = new FlippingExecutionContext();
        fex.addValue("price", e.getPrice());
        return ff4j.check("customised.holidays.discount.enabled", fex);
    }

    public FF4j getFf4j() {
        return ff4j;
    }

    @Required
    public void setFf4j(FF4j ff4j) {
        this.ff4j = ff4j;
    }
}
