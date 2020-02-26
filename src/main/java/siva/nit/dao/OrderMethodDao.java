package siva.nit.dao;

import java.util.List;

import siva.nit.model.OrderMethod;

public interface OrderMethodDao {

	public Integer saveOrderMethod(OrderMethod orderMethod);
	
	public List<OrderMethod> getAllOrderMethods();
}
