package com.training360.creational.simplefactory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PayDetailsFactoryTest {

    @Test
    public void createHourly() {
        PayDetails payDetails = new PayDetailsFactory().create("H;100;50");
        //assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));
        assertThat(((HourlyPayDetails)payDetails).getBase(), equalTo(100d));
        assertThat(((HourlyPayDetails)payDetails).getHours(), equalTo(50));
        assertThat(payDetails.pay(), equalTo(5000d));
    }

    @Test
    public void createMonthly() {
        PayDetails payDetails = new PayDetailsFactory().create("M;100000");
        assertThat(((MonthlyPayDetails)payDetails).getAmount(),equalTo(100_000d));
        assertThat(payDetails.pay(), equalTo(100_000d));
    }


}
