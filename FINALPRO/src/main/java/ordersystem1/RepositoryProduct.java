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

public class RepositoryProduct {
    private ArrayList <Product> Products = new ArrayList<>();
  
public void Create(Product Product) {
Products.add(Product);
}
  
public ArrayList<Product> GetAll(){
return this.Products;
}
}
