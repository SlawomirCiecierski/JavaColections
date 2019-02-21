package controller;

import model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoController {
    private List<Auto> ordered_autos=new ArrayList<>();

    public void addAuto(String vin_no, String brand, String model, double price_basic){

        Auto a = new Auto (vin_no, brand, model, price_basic );
        ordered_autos.add(a);
        System.out.println("Zamówienie przyjęte"+ a);
            }
            public void getAllAutos(){
                for (Auto auto : ordered_autos) {
                    System.out.println(auto);
                }
            }
}
