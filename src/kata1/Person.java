/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;

/**
 *
 * @author OTONIEL
 */
public class Person {
    
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }
    
    private int toYears(long l) {
        return (int) (l/365);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + '}';
    }
    
    
}
