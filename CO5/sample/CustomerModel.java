package com.example.myapplication;

public class CustomerModel {

    private int customerId;
    private String customerName;
    private int customerAge;
    private Boolean cutomerStatus;

    public CustomerModel(int customerId, String customerName, int customerAge, Boolean cutomerStatus) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.cutomerStatus = cutomerStatus;
    }

    public CustomerModel() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public Boolean getCutomerStatus() {
        return cutomerStatus;
    }

    public void setCutomerStatus(Boolean cutomerStatus) {
        this.cutomerStatus = cutomerStatus;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAge=" + customerAge +
                ", cutomerStatus=" + cutomerStatus +
                '}';
    }
}
