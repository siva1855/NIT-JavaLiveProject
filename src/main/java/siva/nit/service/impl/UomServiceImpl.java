package siva.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import siva.nit.dao.UomDao;
import siva.nit.model.Uom;
import siva.nit.service.UomService;

@Service
public class UomServiceImpl implements UomService {
	@Autowired
	private UomDao uomDao;

	@Transactional
	public Integer saveUom(Uom uom) {

		return uomDao.saveUom(uom);
	}

	@Transactional(readOnly = true)
	public List<Uom> getAllUoms() {
		return uomDao.getAllUoms();
	}

	@Transactional
	public void deleteUom(Integer id) {
		uomDao.deleteUom(id);
		
	}
	@Transactional(readOnly = true)
	public Uom getOneUom(Integer id) {
		
		return uomDao.getOneUom(id);
	}

	@Transactional
	public void updateUom(Uom uom) {
		uomDao.updateUom(uom);
		
	}

}
