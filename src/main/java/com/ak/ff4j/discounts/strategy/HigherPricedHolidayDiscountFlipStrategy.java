package com.ak.ff4j.discounts.strategy;

import org.ff4j.core.FeatureStore;
import org.ff4j.core.FlippingExecutionContext;

import org.ff4j.strategy.AbstractFlipStrategy;

public class HigherPricedHolidayDiscountFlipStrategy extends AbstractFlipStrategy
{
    @Override
    public boolean evaluate(String featureName, FeatureStore store, FlippingExecutionContext executionContext) {

        final Long price = (Long) executionContext.getValue("price", true);
        return price >= 2000;
    }
}
