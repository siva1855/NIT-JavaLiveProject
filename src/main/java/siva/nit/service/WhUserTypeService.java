package siva.nit.service;

import java.util.List;

import siva.nit.model.WhUserType;

public interface WhUserTypeService {

	public Integer saveWhUserType(WhUserType whUserType);

	public List<WhUserType> getAllWhUserTypes();

	public void deleteWhUserType(Integer id);

	public WhUserType getOneWhUserType(Integer id);

	public void updateWhUserType(WhUserType whUserType);
}
