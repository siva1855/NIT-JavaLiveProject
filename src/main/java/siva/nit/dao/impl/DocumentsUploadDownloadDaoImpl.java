package siva.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import siva.nit.dao.DocumentsUploadDownloadDao;
import siva.nit.model.DocumentsUploadDownload;

@Repository
public class DocumentsUploadDownloadDaoImpl implements DocumentsUploadDownloadDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Integer saveDocumentsUploadDownload(DocumentsUploadDownload documentsUpload) {

		return (Integer) hibernateTemplate.save(documentsUpload);
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getFileIdAndNames() {
		String hql = "select fileId,fileName from siva.nit.model.DocumentsUploadDownload";
		return (List<Object[]>) hibernateTemplate.find(hql);
	}

	public DocumentsUploadDownload getOneDocument(Integer id) {
		return hibernateTemplate.get(DocumentsUploadDownload.class, id);
	}
}
