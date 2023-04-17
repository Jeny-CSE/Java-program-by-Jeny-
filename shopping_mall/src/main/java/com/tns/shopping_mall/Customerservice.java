package com.tns.shopping_mall;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional

public class Customerservice {
	@Autowired

	private CustomerServicesRepository repo;
	public List <Customer> listAll()
	{
		return repo.findAll();
	}
	public Customer get(Integer customerId)
	{
		return repo.findById(customerId).get();
	}
	public void delete(Integer customerId)
	{
		repo.deleteById(customerId);
	}
	public void save (Customer cus)
	{
		repo.save(cus);
	}

}

}
