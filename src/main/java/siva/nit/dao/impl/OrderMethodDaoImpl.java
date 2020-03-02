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

	public void delectOrderMarhod(Integer id) {
		hibernateTemplate.delete(new OrderMethod(id));
	}

	public OrderMethod getOneOrderMethod(Integer id) {
		return hibernateTemplate.get(OrderMethod.class, id);
	}

	public void updateOrderMethod(OrderMethod orderMethod) {
		hibernateTemplate.update(orderMethod);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getOrderMethodTypeCount() {
		String hql = "select orderMethodType,count(orderMethodType) from siva.nit.model.OrderMethod group by orderMethodType";
		return (List<Object[]>) hibernateTemplate.find(hql);
	}

}
