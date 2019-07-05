package com.ak.ff4j.discounts;

import com.ak.ff4j.discounts.model.HolidayPackage;

public interface DiscountService {

    boolean isEligibleForDiscount(HolidayPackage e);

    boolean isEligibleForCustomisedDiscount(HolidayPackage e);
}
