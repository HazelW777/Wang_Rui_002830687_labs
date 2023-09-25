/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 40121
 */
public class VitalSigns {
    
    private double termperature;
    private double bloodPressure;
    private int pluse;
    private String date;

    public double getTermperature() {
        return termperature;
    }

    public void setTermperature(double termperature) {
        this.termperature = termperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPluse() {
        return pluse;
    }

    public void setPluse(int pluse) {
        this.pluse = pluse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString(){
        return date;
    }
}
