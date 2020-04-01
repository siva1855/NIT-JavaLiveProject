package siva.nit.dao.impl;

import java.util.List;
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

	public List<WhUserType> getAllWhUserTypes() {

		return hibernateTemplate.loadAll(WhUserType.class);
	}

	public void deleteWhUserType(Integer id) {

		hibernateTemplate.delete(new WhUserType(id));
	}

	public WhUserType getOneWhUserType(Integer id) {

		return hibernateTemplate.get(WhUserType.class, id);
	}

	public void updateWhUserType(WhUserType whUserType) {
		hibernateTemplate.update(whUserType);
	}
}
