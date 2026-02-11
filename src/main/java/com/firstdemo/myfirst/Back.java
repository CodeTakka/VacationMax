package com.firstdemo.myfirst;

import dto.VariablesBehind;
import dto.VariablesQuestion;
import org.springframework.stereotype.Service;

@Service
public class Back {

    public VariablesBehind evaluate(VariablesQuestion request) {
        if (request == null) {
            throw new IllegalArgumentException("Your request cannot be null");
        }

        int days = request.getDays();
        if (days <= 0) {
            throw new IllegalArgumentException("Days cannot be less than zero");
        }

        double budget = request.getBudget();
        if (budget <= 0) {
            throw new IllegalArgumentException("Budget cannot be less than zero");
        }

        double flightCost = request.getFlightCost();
        if (flightCost < 0) {
            throw new IllegalArgumentException("Cost of flight cannot be less than zero");
        }

        double nightCost = request.getNightCost();
        if (nightCost < 0) {
            throw new IllegalArgumentException("Cost per night cannot be less than zero");
        }

        double night = nightCost * days;
        double flight = flightCost;
        double food = request.getFoodCost() * days;
        double activities = request.getActivitiesCost() * days;
        double transportCost = request.getTransportCost() * days;
        double emergencyMoney = request.getEmergencyMoney();

        double totalCost = night + flight + food + activities + transportCost + emergencyMoney;
        double budgetGap = Math.max(0, totalCost - budget);

        String status;
        if (budgetGap == 0) {
            status = "AFFORDABLE";
        } else if ((budgetGap / totalCost) <= 0.10) {
            status = "TIGHT";
        } else {
            status = "NOT_AFFORDABLE";
        }

        return new VariablesBehind(
                status,
                round2(budgetGap),
                round2(totalCost)
        );
    }

    private double round2(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
