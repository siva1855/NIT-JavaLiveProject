package siva.nit.dao;

import java.util.List;

import siva.nit.model.ShipmentType;

public interface ShipmentTypeDao {

	public Integer saveShipmentType(ShipmentType shipmentType);

	public List<ShipmentType> getAllShipmentTypes();

	public void delectShipmentType(Integer id);

	public ShipmentType getOneShipmentType(Integer id);
	
	public void updateShipmentType(ShipmentType shipmentType);
	
	public List<Object[]> getShipmentTypeModeCount();
}
