/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata_1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Kata_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Blas", new Date(49,8,24));
        System.out.println(p + " tiene " + p.getAge() + " años");
    }
    
}
