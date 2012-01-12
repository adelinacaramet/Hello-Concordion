package org.concordion.samples;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class HelloTest {

    public String greetingFor(String firstName) {
        return String.format("Hello %s!", firstName);
    }
}
