package com.itheima.action;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.itheima.utils.Constant;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CustomerAction extends ActionSupport implements ModelDriven {

    private Customer customer;

    @Autowired
    private CustomerService customerService;


    @Override
    public Object getModel() {
        if (customer == null) {
            customer = new Customer();
        }
        return customer;
    }

    public String save() {
        System.out.println("CustomerAction#save----customer" + customer);
        customerService.save(customer);
        return Constant.SAVE_SUCCESS;
    }
}
