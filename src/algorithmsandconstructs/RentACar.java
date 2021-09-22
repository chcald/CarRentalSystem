/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.io.BufferedReader;
import java.util.List;

/**
 *
 * @author anapaula
 */
public class RentACar implements RentACarInterface {
     
    private List<CarInterface> Cars;
     private String Name;
     private int NumberOfCars;
     
    
     
    @Override
    public List<CarInterface> getCars() {
        return Cars;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.Cars = cars;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
       this.Name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        return true;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
      return 0;
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        return true;
    }
    
    @Override
    public int getNumberOfCars() {
       return NumberOfCars;
    }
    
}
