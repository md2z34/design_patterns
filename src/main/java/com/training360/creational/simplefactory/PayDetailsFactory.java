package com.training360.creational.simplefactory;

public class PayDetailsFactory {

    /*
     * M;100000 - monthly
     * H;100;50 - hourly
     */
    public PayDetails create(String type) {
        if (type.startsWith("M")) {
            String[] parts = type.split(";");
            return new MonthlyPayDetails(Double.parseDouble(parts[1]));
        } else if (type.startsWith("H")) {
            String[] parts = type.split(";");
            return new HourlyPayDetails(Double.parseDouble(parts[1]),Integer.parseInt(parts[2]));
        } else {
            throw new IllegalArgumentException();
        }
    }
}
