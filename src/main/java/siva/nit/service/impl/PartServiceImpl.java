package siva.nit.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import siva.nit.dao.PartDao;
import siva.nit.model.Part;
import siva.nit.service.PartService;

@Service
public class PartServiceImpl implements PartService {
	@Autowired
	private PartDao partDao;

	@Transactional
	public Integer savePart(Part part) {
		return partDao.savePart(part);
	}

	@Transactional(readOnly = true)
	public List<Part> getAllParts() {
		List<Part> partList = partDao.getAllParts();
		Collections.sort(partList, (o1, o2) -> o1.getPartId() - o2.getPartId());
		return partList;
	}

	@Transactional
	public void delectPart(Integer id) {
		partDao.delectPart(id);
	}

	@Transactional(readOnly = true)
	public Part getOnePart(Integer id) {
		return partDao.getOnePart(id);
	}

	@Transactional
	public void updatePart(Part part) {
		partDao.updatePart(part);
	}

}
