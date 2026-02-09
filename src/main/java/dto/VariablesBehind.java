package dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariablesBehind {

    private double budgetGap;
    private double totalCost;
    private String VacationStatus;

    private HashMap<String, Double> costDetail;
    private List<String> suggestions;

    public VariablesBehind (String VacationStatus, double budgetGap, double totalCost, HashMap<String, Double> costDetail,List<String> suggestions){
        this.VacationStatus = VacationStatus;
        this.budgetGap = budgetGap;
        this.totalCost = totalCost;
        this.costDetail = costDetail;
        this.suggestions = suggestions;
    }

    public double getBudgetGap() {
        return budgetGap;
    }

    public void setBudgetGap(double budgetGap) {
        this.budgetGap = budgetGap;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getVacationStatus() {
        return VacationStatus;
    }

    public void setVacationStatus(String vacationStatus) {
        VacationStatus = vacationStatus;
    }

    public HashMap<String, Double> getCostDetail() {
        return costDetail;
    }

    public void setCostDetail(HashMap<String, Double> costDetail) {
        this.costDetail = costDetail;
    }
}
