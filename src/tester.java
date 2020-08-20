/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mwill279
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car mycar = new Car("lucille", "Red", "honda", "accord");
        
        Car yourcar = new Car();
        
        
        
        System.out.println(mycar.getName());
        System.out.println(mycar.getColor() + ", ");
        
    }
    
}
