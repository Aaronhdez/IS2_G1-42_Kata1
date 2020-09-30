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
public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthdate=" + birthdate + '}';
    }
    
    public int getAge(){
        Calendar today = new GregorianCalendar().getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()-this.birthdate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
        return milles/ this.MILLISECONDS_PER_YEAR;
    }
}
