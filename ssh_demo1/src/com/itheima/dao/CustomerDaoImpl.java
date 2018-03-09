package com.itheima.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.domain.Customer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

	public void save(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}

}
