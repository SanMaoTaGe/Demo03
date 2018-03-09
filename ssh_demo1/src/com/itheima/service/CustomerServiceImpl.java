package com.itheima.service;

import com.itheima.dao.CustomerDao;
import com.itheima.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(readOnly = false)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void save(Customer customer) {
		customerDao.save(customer);
	}

}
