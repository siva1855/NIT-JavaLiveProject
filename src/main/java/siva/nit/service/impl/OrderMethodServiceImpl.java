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
}
