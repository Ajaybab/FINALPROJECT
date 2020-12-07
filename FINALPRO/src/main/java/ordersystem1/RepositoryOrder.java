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

public class RepositoryOrder {
    private ArrayList <Order> orders = new ArrayList<>();
  
public void Create(Order order) {
orders.add(order);
}
  
public ArrayList<Order> GetAll(){
return this.orders;
}
}
