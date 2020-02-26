package siva.nit.service;

import java.util.List;

import siva.nit.model.OrderMethod;

public interface OrderMethodService {
	
	public Integer saveOrderMethod(OrderMethod orderMethod);
	public List<OrderMethod> getAllOrderMethods();
}
