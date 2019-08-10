package com.ak.ff4j.controllers;

import com.ak.ff4j.discounts.DiscountService;
import com.ak.ff4j.discounts.model.HolidayPackage;
import com.ak.ff4j.flights.FlightBookingAgent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {

    @Resource(name = "flightBookingAgent")
    private FlightBookingAgent flightBookingAgent;

    @Resource(name = "discountService")
    private DiscountService discountService;

    @RequestMapping(value = "/flight", method = RequestMethod.GET)
    public String getAllEmployees(Model model)
    {
        model.addAttribute("agent", flightBookingAgent.getFlightBookingAgent());
        return "flightDetails";
    }

    @RequestMapping(value = "/discount", method = RequestMethod.GET)
    public String displayDiscountPage(Model model)
    {
        final List<HolidayPackage> holidayPackages = createHolidayPackages();

        holidayPackages.forEach(e -> {
            e.setEligibleForDiscount(discountService.isEligibleForDiscount(e));
        });

        holidayPackages.forEach(e -> {
            e.setEligibleForCustomisedDiscount(discountService.isEligibleForCustomisedDiscount(e));
        });

        model.addAttribute("holidayPackages", holidayPackages);
        return "discount";
    }
    private List<HolidayPackage> createHolidayPackages()
    {

        final List<HolidayPackage> holidayPackages = new ArrayList<>();
        holidayPackages.add(new HolidayPackage("Paris", 1900));
        holidayPackages.add(new HolidayPackage("London", 2500));
        holidayPackages.add(new HolidayPackage("Tenerife", 3000));
        holidayPackages.add(new HolidayPackage("Amsterdam", 1880));

        return holidayPackages;
    }
}
