package siva.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import siva.nit.dao.UomDao;
import siva.nit.model.Uom;



@Repository
public class UomDaoImpl implements UomDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Integer saveUom(Uom uom) {
		Integer id = (Integer) hibernateTemplate.save(uom);
		return id;
	}

	public List<Uom> getAllUoms() {

		return hibernateTemplate.loadAll(Uom.class);
	}

	
	public void deleteUom(Integer id) {
		
		hibernateTemplate.delete(new Uom(id));
	}
	
	
	public Uom getOneUom(Integer id) {
		return 	hibernateTemplate.get(Uom.class, id);
	}

	public void updateUom(Uom uom) {
		hibernateTemplate.update(uom);
	}
}