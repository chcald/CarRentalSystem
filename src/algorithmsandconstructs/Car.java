/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cristiancalderon
 */
public class Car implements CarInterface {

    private Make make;
    private double rate;
    private int id;
    private Map<Month, boolean[]> availability;

    public Car(double rate, Make make, int id) {
        this.rate = rate;
        this.make = make;
        this.id = id;
    }

    @Override
    public Map<Month, boolean[]> createAvailability() {
        availability = new HashMap<Month, boolean[]>();
        
        return availability;
    }

    @Override
    public Make getMake() {
        return this.make;
    }

    @Override
    public void setMake(Make make) {
        this.make = make;
    }

    @Override
    public double getRate() {
        return this.rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        return this.availability;
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.availability = availability;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        
        boolean[] days = availability.get(month);
                
        return days[day];
    }

    @Override
    public boolean book(Month month, int day) {
        if (isAvailable(month, day)) {
           boolean[] days = availability.get(month);
           days[day] = false;
        }
        return true;
    }

}
