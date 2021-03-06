package siva.nit.service;

import java.util.List;

import siva.nit.model.Uom;

public interface UomService {

	public Integer saveUom(Uom uom);

	public List<Uom> getAllUoms();

	public void deleteUom(Integer id);

	public Uom getOneUom(Integer id);

	public void updateUom(Uom uom);

	public List<Object[]> getUomTypeCount();
	
	public List<Object[]> getUomIdAndUomModel();
}
