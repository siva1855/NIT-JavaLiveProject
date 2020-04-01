package siva.nit.dao;

import java.util.List;

import siva.nit.model.WhUserType;

public interface WhUserTypeDao {

	
	public Integer saveWhUserType(WhUserType whUserType);
	
	public List<WhUserType> getAllWhUserTypes();
	
	public void deleteWhUserType(Integer id);
	
	public WhUserType getOneWhUserType(Integer id);
	
	public void updateWhUserType(WhUserType whUserType);
}
