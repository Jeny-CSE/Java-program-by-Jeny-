package com.tns.shopping_mall;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class CustomerServicesController {
	
	@Autowired
	private Customerservice a;

	@GetMapping(("/Customerservice"))
	public List<Customer> list()
	{
		return a.listAll();
	}
	@GetMapping("/Customerservice/(cr_id)")
	public ResponseEntity<Customer> get (@PathVariable Integer cr_id)
	{
		try
		{
			Customer cr=a.get(cr_id);
			return new ResponseEntity<Customer>(cr,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/Customerservice")
	public void add(@RequestBody Customer cus)
	{
		a.save(cus);
	}
	@PutMapping("/Customerservice/(cr_id)")
	public ResponseEntity<?> update(@RequestBody Customer cus,@PathVariable Integer cr_id)
	{
		Customer existadmin=a.get(cr_id);
		a.save(cus);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/Customerservice/(cr_id)")
	public void delete (@PathVariable Integer cr_id)
	{
		a.delete(cr_id);
	}

}

}
