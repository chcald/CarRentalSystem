/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anapaula
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String name = in.readLine();
        String content = "";

        int countCars = 0;
        int id = 1;

        List<CarInterface> cars = new ArrayList<CarInterface>();

        while (name != null) {
            System.out.println(name);
            content = in.readLine();

            String[] atr = content.split(":");

//            for (int i = 0; i < atr.length; i++) {
//                String string = atr[i];
//                System.out.println("Content***" + string); 
//            }
            double rate = Double.valueOf(atr[1]);

            Make make = Make.valueOf(atr[0]);

            int numberOfCars = Integer.valueOf(atr[2]);

            for (int i = 0; i < numberOfCars; i++) {
                
                cars.add(new Car(rate, make, id++));

            }

            name = in.readLine();
        }
        RentACarInterface rentACar = new RentACar(countCars);
        rentACar.setName(name);
        rentACar.setCars(cars);

        return rentACar;
    }

}
