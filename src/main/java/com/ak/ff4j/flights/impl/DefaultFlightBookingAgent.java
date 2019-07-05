package com.ak.ff4j.flights.impl;

import com.ak.ff4j.flights.FlightBookingAgent;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Required;

public class DefaultFlightBookingAgent implements FlightBookingAgent
{
    private FF4j ff4j;

    public String getFlightBookingAgent()
    {
        if (ff4j.check("allow.easyjet.enabled"))
        {
            return "easyJet";
        }
        else
        {
            return "tui";
        }
    }

    public FF4j getFf4j() {
        return ff4j;
    }

    @Required
    public void setFf4j(FF4j ff4j) {
        this.ff4j = ff4j;
    }
}
