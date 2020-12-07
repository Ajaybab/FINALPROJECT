/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
package ordersystem1;




import java.util.ArrayList;

public class RepositoryCustomer {
    private ArrayList <Customer> customers = new ArrayList<>();
  
public void Create(Customer customer) {
customers.add(customer);
}
  
public ArrayList<Customer> GetAll(){
return this.customers;
}
}
