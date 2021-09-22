/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author anapaula
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String title = in.readLine();
        String content = "";
        
        
        RentACarInterface rentACar = new RentACar();
        
        List<CarInterface> cars = new List<Car>();
        
        while(title != null){
            System.out.println(title);
            content = in.readLine();
            System.out.println(content);
            
            
            Car item = new Car(title, content);
            rentACar.addItem(item);
            
            title = in.readLine();
        }
         
        return feed;
    }
    
   
}
