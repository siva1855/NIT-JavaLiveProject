package siva.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import siva.nit.dao.OrderMethodDao;
import siva.nit.model.OrderMethod;

@Repository
public class OrderMethodDaoImpl implements OrderMethodDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Integer saveOrderMethod(OrderMethod orderMethod) {
		return (Integer) hibernateTemplate.save(orderMethod);
	}

	public List<OrderMethod> getAllOrderMethods() {
		return hibernateTemplate.loadAll(OrderMethod.class);
	}
}
