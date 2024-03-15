

package com.mycompany.ejercicio_restaurante;

import people.Customer;
import values.CustomerRole;


public class Ejercicio_restaurante {

    public static void main(String[] args) {
       Customer student = new Customer (CustomerRole.STUDENT, "1", "Pepitp Perez");
       student.sellFood();
       
       Customer administrative = new Customer (CustomerRole.ADMINISTRATIVE, "2", "Julanito");
       administrative.sellFood();
    }
}
