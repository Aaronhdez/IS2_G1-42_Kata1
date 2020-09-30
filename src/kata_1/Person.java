/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata_1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthdate=" + birthdate + '}';
    }
    
    public int getAge(){
        Period years = this.birthdate.until(LocalDate.now());
        return years.getYears();
    }
}
