package edu.miu.cs489.apsd;

import edu.miu.cs489.apsd.edu.miu.cs489.apsd.model.Customer;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        var anna = new Customer(101L, "Anna", "Smith", LocalDate.of(1980, 1, 1));
        System.out.println(anna);
        System.out.println(anna.getFirstName());
    }
}
