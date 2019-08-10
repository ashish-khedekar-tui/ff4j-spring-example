package com.ak.ff4j.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    final static Logger LOG = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model)
    {
        LOG.info("Display login page");
        return "login";
    }

    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public String loginerror(ModelMap model)
    {
        model.addAttribute("error", "true");
        return "denied";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "logout";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage(ModelMap map) {
        return "redirect:/login";
    }

}
