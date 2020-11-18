
package kata1;

import java.time.LocalDate;
import java.time.Month;


public class Main {

    public static void main(String[] args) {
        
        Person person = new Person("El Pepe", LocalDate.of(1970, Month.MARCH, 30));
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
