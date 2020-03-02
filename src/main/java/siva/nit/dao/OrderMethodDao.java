package siva.nit.dao;

import java.util.List;

import siva.nit.model.OrderMethod;

public interface OrderMethodDao {

	public Integer saveOrderMethod(OrderMethod orderMethod);

	public List<OrderMethod> getAllOrderMethods();

	public void delectOrderMarhod(Integer id);

	public OrderMethod getOneOrderMethod(Integer id);

	public void updateOrderMethod(OrderMethod orderMethod);

	public List<Object[]> getOrderMethodTypeCount();
}
