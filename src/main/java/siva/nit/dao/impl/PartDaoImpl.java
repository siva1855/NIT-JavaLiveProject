package siva.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import siva.nit.dao.PartDao;
import siva.nit.model.Part;

@Repository
public class PartDaoImpl implements PartDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Integer savePart(Part part) {
		Integer id = (Integer) hibernateTemplate.save(part);
		return id;
	}

	public List<Part> getAllParts() {
		return hibernateTemplate.loadAll(Part.class);
	}

	public void delectPart(Integer id) {
		hibernateTemplate.delete(new Part(id));
	}

	public Part getOnePart(Integer id) {
		return hibernateTemplate.get(Part.class, id);
	}

	public void updatePart(Part part) {
		hibernateTemplate.update(part);
	}

}
