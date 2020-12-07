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

public class OrderSystem {
    public static void main(String[] args) {
RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
RepositoryOrder repositoryOrder = new RepositoryOrder();
RepositoryOrderItem repositoryOrderItem = new RepositoryOrderItem();
RepositoryProduct repositoryProduct = new RepositoryProduct();
  
Customer customer1 = new Customer(463, "Jeff", "Kim", "784366664");
Customer customer2 = new Customer(464, "Simon", "Clinton", "7993453324");
Customer customer3 = new Customer(465, "Athman", "Jobs", "7499392234");
  
repositoryCustomer.Create(customer1);
repositoryCustomer.Create(customer2);
repositoryCustomer.Create(customer3);
  
Product product1 = new Product(0, "Washing Mashine", 34, 5600);
Product product2 = new Product(1, "Ramtons Fridge", 22, 35410);
Product product3 = new Product(2, "Sony TV 64'", 12, 102000);
Product product4 = new Product(3, "Lorezetti shower head", 5, 460);
  
repositoryProduct.Create(product1);
repositoryProduct.Create(product2);
repositoryProduct.Create(product3);
repositoryProduct.Create(product4);
  
Order order1 = new Order(567827, 463, "28/11/20");
Order order2 = new Order(567828, 464, "17/10/20");
Order order3 = new Order(567829, 465, "02/12/20");
  
repositoryOrder.Create(order1);
repositoryOrder.Create(order2);
repositoryOrder.Create(order3);
  
OrderItem orderItem1 = new OrderItem(567827, 50, 0, "Washing Mashine", 2, 11200);
OrderItem orderItem2 = new OrderItem(567828, 51, 1, "Ramtons Fridge", 2, 70820);
OrderItem orderItem3 = new OrderItem(567829, 52, 2, "Sony TV", 2, 204000);
OrderItem orderItem4 = new OrderItem(567827, 53, 3, "Lorezetti shower head", 3, 8000);
OrderItem orderItem5 = new OrderItem(567828, 54, 1, "Washing Mashine", 6, 33600);
OrderItem orderItem6 = new OrderItem(567829, 55, 3, "Sony TV", 5, 510000);
  
repositoryOrderItem.Create(orderItem1);
repositoryOrderItem.Create(orderItem2);
repositoryOrderItem.Create(orderItem3);
repositoryOrderItem.Create(orderItem4);
repositoryOrderItem.Create(orderItem5);
repositoryOrderItem.Create(orderItem6);
  
ArrayList <Customer> customers = repositoryCustomer.GetAll();
ArrayList <Order> order = repositoryOrder.GetAll();
ArrayList <OrderItem> orderItem = repositoryOrderItem.GetAll();
  
for (int i = 0; i < customers.size(); i++) {
for (int y = 0; y < orderItem.size(); y++) {
if (customers.get(i).getCustomerID() == order.get(i).getCustomerID()) {
if (order.get(i).getOrderNumber() == orderItem.get(y).getOrderNumber()) {
System.out.println(customers.get(i).toString());
System.out.println(order.get(i).toString());
System.out.println(orderItem.get(i).toString());
}
}
}
}
}
}

