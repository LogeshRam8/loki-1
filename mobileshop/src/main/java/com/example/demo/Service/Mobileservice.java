package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Mobilegadgets;
import com.example.demo.Repository.Storingdata;

@Service
public class Mobileservice {
	@Autowired
	Storingdata repository;
	
	public String addCustomer(Mobilegadgets customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<Mobilegadgets> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<Mobilegadgets> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(Mobilegadgets customer)
	{
		repository.save(customer);
		return "Updated";
	}
	public void deleteById(int id)
	{
		repository.deleteById(id);
	}
}