package com.ak.ff4j.discounts.model;

public class HolidayPackage {

    private String destination;

    private long price;

    private boolean eligibleForDiscount;

    private boolean eligibleForCustomisedDiscount;

    public HolidayPackage(String destination, long price) {

        this.destination = destination;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isEligibleForDiscount() {
        return eligibleForDiscount;
    }

    public void setEligibleForDiscount(boolean eligibleForDiscount) {
        this.eligibleForDiscount = eligibleForDiscount;
    }

    public boolean isEligibleForCustomisedDiscount() {
        return eligibleForCustomisedDiscount;
    }

    public void setEligibleForCustomisedDiscount(boolean eligibleForCustomisedDiscount) {
        this.eligibleForCustomisedDiscount = eligibleForCustomisedDiscount;
    }
}
