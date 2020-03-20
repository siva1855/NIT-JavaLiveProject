package siva.nit.service.impl;

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

}
