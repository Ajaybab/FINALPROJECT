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

public class RepositoryOrderItem {
    private ArrayList <OrderItem> OrderItems = new ArrayList<>();
  
public void Create(OrderItem OrderItem) {
OrderItems.add(OrderItem);
}
  
public ArrayList<OrderItem> GetAll(){
return this.OrderItems;
}
}
