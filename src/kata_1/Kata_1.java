/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Kata_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949,9,24);
        
        Person p = new Person("Blas", date);
        System.out.println(p.getName() + " tiene " + p.getAge() + " años");
    }
    
}
