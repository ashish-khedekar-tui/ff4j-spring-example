package com.ak.ff4j;

import com.ak.ff4j.flights.FlightBookingAgent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");

        final FlightBookingAgent flightBookingAgent = context.getBean("flightBookingAgent", FlightBookingAgent.class);
        System.out.println(flightBookingAgent.getFlightBookingAgent());
    }
}
