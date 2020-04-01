package siva.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import siva.nit.dao.WhUserTypeDao;
import siva.nit.model.WhUserType;
import siva.nit.service.WhUserTypeService;

@Service
public class WhUserTypeServiceImpl implements WhUserTypeService {

	@Autowired
	private WhUserTypeDao whUserTypeDao;

	@Transactional
	public Integer saveWhUserType(WhUserType whUserType) {
		return whUserTypeDao.saveWhUserType(whUserType);
	}

	@Transactional(readOnly = true)
	public List<WhUserType> getAllWhUserTypes() {
		return whUserTypeDao.getAllWhUserTypes();
	}

	@Transactional
	public void deleteWhUserType(Integer id) {

		whUserTypeDao.deleteWhUserType(id);
	}

	@Transactional(readOnly = true)
	public WhUserType getOneWhUserType(Integer id) {

		return whUserTypeDao.getOneWhUserType(id);
	}

	@Transactional
	public void updateWhUserType(WhUserType whUserType) {
		whUserTypeDao.updateWhUserType(whUserType);

	}
}
