package com.ak.ff4j;

import org.ff4j.FF4j;
import org.ff4j.web.FF4jProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

public class DefaultFf4jProvider implements FF4jProvider {

    @Autowired
    private FF4j ff4j;

    /**
     * Inject the appropriate Spring bean FF4j declared into
     * {@link ApplicationConfig}. Property {@code ff4j} marked with @Autowired
     * annotation will work.
     */
    public DefaultFf4jProvider() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Override
    public FF4j getFF4j() {
        return ff4j;
    }
}
