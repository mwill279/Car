/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwill279
 */
public class Car {
    private String name;
    private String Color;
    private String make;
    private String model;
    
    public Car(){
        name = "";
        Color = "";
        make = "";
        model = "";
    }
    
    public Car(String newname, String newColor, String newMake, String newmodel){
        name = newname;
        Color = newColor;
        make = newMake;
        model = newmodel;
    }
    
    public String getName(){
        return name;
    }
    
    public String getColor(){
        return Color;
    }
    
    public String getnewColor(String newColor){
        return Color + ", " + newColor; 
    }
    
}
