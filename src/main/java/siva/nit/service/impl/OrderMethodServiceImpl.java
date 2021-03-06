package siva.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import siva.nit.dao.OrderMethodDao;
import siva.nit.model.OrderMethod;

import siva.nit.service.OrderMethodService;

@Service
public class OrderMethodServiceImpl implements OrderMethodService {
	@Autowired
	private OrderMethodDao orderMethodDao;

	@Transactional
	public Integer saveOrderMethod(OrderMethod orderMethod) {
		return orderMethodDao.saveOrderMethod(orderMethod);
	}

	@Transactional(readOnly = true)
	public List<OrderMethod> getAllOrderMethods() {
		List<OrderMethod> orderMethodList = orderMethodDao.getAllOrderMethods();
		Collections.sort(orderMethodList, (o1, o2) -> o1.getOrderMethodId() - o2.getOrderMethodId());
		return orderMethodList;
	}

	@Transactional
	public void delectOrderMarhod(Integer id) {
		orderMethodDao.delectOrderMarhod(id);
	}

	@Transactional(readOnly = true)
	public OrderMethod getOneOrderMethod(Integer id) {
		return orderMethodDao.getOneOrderMethod(id);
	}

	@Transactional
	public void updateOrderMethod(OrderMethod orderMethod) {
		orderMethodDao.updateOrderMethod(orderMethod);
	}

	@Transactional(readOnly = true)
	public List<Object[]> getOrderMethodTypeCount() {
		return orderMethodDao.getOrderMethodTypeCount();
	}
	
	@Transactional(readOnly = true)
	public List<Object[]> getOrderMethodIdAndOrderMethodCode(String orderMethodMode){
		return orderMethodDao.getOrderMethodIdAndOrderMethodCode(orderMethodMode);
	}
	
}
