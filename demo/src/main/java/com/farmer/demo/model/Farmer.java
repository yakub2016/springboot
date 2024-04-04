package com.farmer.demo.model;
import jakarta.persistence.*;

@Entity

@Table(name = "Farmers")

public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private int phone;

    @Column(name = "address")
    private String address;

    @Column(name = "items")
    private String items;

    @Column(name = "quantity")
    private int quantity;
    
    @Column(name = "weights")
    private int weights;
    

    public Farmer() {
    }
//    public Farmer(String name, String email,int phone,String address,String items,int quantity,int weights) {
//        super();
//       
//        this.name = name;
//        this.email = email;
//        this.phone=phone;
//        this.address=address;
//        this.items=items;
//        this.quantity=quantity;
//        this.weights=weights;
//       
//         }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
    	this.name = name;

    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {

        this.email = email;
    }
    
    
    public int getPhone() {
    	return phone;
    }
    
    public void setPhone(int phone) {
    	this.phone=phone;
    }
    
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
    	this.address=address;
    }
    
    
    public String getItems() {
    	return items;
    }
    
    public void setItems(String items) {
    	this.items=items;
    }
    
    public int getQuantity() {
    	return quantity;
    }
    
    public void setQuantity(int quantity) {
    	this.quantity=quantity;
    }
    
    public int getWeights() {
    	return weights;
    }
    
    public void setWeights(int weights) {
    	this.weights=weights;
    }
    
 
    
  
	

}
