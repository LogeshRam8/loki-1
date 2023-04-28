package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Mobilegadgets;
import com.example.demo.Service.Mobileservice;

@RestController
@RequestMapping("/customer")
public class Control {
	@Autowired
	Mobileservice  Service;
	
	@PostMapping("/post")
	public String create(@RequestBody Mobilegadgets customer)
	{
		return Service.addCustomer(customer);
	}
	@GetMapping("")
	public List<Mobilegadgets> read()
	{
		return Service.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<Mobilegadgets>readById(@PathVariable int id)
	{
		return Service.getCustomerById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody Mobilegadgets customer)
	{
		return Service.updateCustomer(customer);
	}
	@DeleteMapping("/delete/(id)")
	public String delete(@PathVariable("id") int id)
	{
		Service.deleteById(id);
		return "Deleted";
	}
}
