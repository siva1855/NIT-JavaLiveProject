package siva.nit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import siva.nit.dao.WhUserTypeDao;
import siva.nit.model.WhUserType;
@Repository
public class WhUserTpeDaoImpl implements WhUserTypeDao {
@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Integer saveWhUserType(WhUserType whUserType) {
		return (Integer) hibernateTemplate.save(whUserType);
	}

}
