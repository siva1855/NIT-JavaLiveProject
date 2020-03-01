package siva.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import siva.nit.dao.ShipmentTypeDao;
import siva.nit.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements ShipmentTypeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Integer saveShipmentType(ShipmentType shipmentType) {
		Integer id = (Integer) hibernateTemplate.save(shipmentType);
		return id;
	}

	public List<ShipmentType> getAllShipmentTypes() {
		return hibernateTemplate.loadAll(ShipmentType.class);
	}

	public void delectShipmentType(Integer id) {
		hibernateTemplate.delete(new ShipmentType(id));
	}

	public ShipmentType getOneShipmentType(Integer id) {
		return hibernateTemplate.get(ShipmentType.class, id);
	}

	public void updateShipmentType(ShipmentType shipmentType) {
		hibernateTemplate.update(shipmentType);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getShipmentTypeModeCount() {
		String hql = "select shipmentMode,count(shipmentMode) from siva.nit.model.ShipmentType group by shipmentMode";
		return (List<Object[]>) hibernateTemplate.find(hql);
	}
}
