package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobilegadgets {
@Id
private String Model;
private String Brand;
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Mobilegadgets [Model=" + Model + ", Brand=" + Brand + ", id=" + id + ", Price=" + Price + "]";
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
private String Price;
}
