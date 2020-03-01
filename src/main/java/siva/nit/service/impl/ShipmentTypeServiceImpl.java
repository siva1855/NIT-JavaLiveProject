package siva.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import siva.nit.dao.ShipmentTypeDao;
import siva.nit.model.ShipmentType;
import siva.nit.service.ShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements ShipmentTypeService {
	@Autowired
	private ShipmentTypeDao shipmentTypeDao;

	@Transactional
	public Integer saveShipmentType(ShipmentType shipmentType) {
		return shipmentTypeDao.saveShipmentType(shipmentType);
	}

	@Transactional(readOnly = true)
	public List<ShipmentType> getAllShipmentTypes() {
		List<ShipmentType> shipmentTypeList = shipmentTypeDao.getAllShipmentTypes();
		Collections.sort(shipmentTypeList, (o1, o2) -> o1.getShipmentTypeId() - o2.getShipmentTypeId());
		return shipmentTypeList;
	}

	@Transactional
	public void delectShipmentType(Integer id) {
		shipmentTypeDao.delectShipmentType(id);

	}

	@Transactional(readOnly = true)
	public ShipmentType getOneShipmentType(Integer id) {

		return shipmentTypeDao.getOneShipmentType(id);
	}

	@Transactional
	public void updateShipmentType(ShipmentType shipmentType) {

		shipmentTypeDao.updateShipmentType(shipmentType);
	}

	@Transactional(readOnly = true)
	public List<Object[]> getShipmentTypeModeCount() {
		return shipmentTypeDao.getShipmentTypeModeCount();
	}
}
