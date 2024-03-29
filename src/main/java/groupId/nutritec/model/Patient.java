package groupId.nutritec.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Patient {
    @Id
    private String CPF;
    private String name;
    private int age;
    private BigDecimal weight;
    private BigDecimal height;
    private String healthPlan;

    public Patient(String CPF, String name, int age, BigDecimal weight, BigDecimal height, String healthPlan) {
        this.CPF = CPF;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.healthPlan = healthPlan;
    }

    public Patient() {
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

}