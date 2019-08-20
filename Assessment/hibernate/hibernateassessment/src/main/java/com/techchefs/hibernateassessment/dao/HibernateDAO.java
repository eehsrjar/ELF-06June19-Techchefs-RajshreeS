package com.techchefs.hibernateassessment.dao;

import com.techchefs.hibernateassessment.dto.CustomerBean;

public interface HibernateDAO {
	boolean saveOrUpdate(CustomerBean bean);
	CustomerBean getCustomerInfo(int id);
	boolean deleteCustomerInfo(int id);
	
}
