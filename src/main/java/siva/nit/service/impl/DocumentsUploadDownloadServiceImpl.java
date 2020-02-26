package siva.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import siva.nit.dao.DocumentsUploadDownloadDao;
import siva.nit.model.DocumentsUploadDownload;
import siva.nit.service.DocumentsUploadDownloadService;

@Service
public class DocumentsUploadDownloadServiceImpl implements DocumentsUploadDownloadService {

	@Autowired
	private DocumentsUploadDownloadDao documentsUploadDownloadDao;

	@Transactional
	public Integer saveDocumentsUploadDownload(DocumentsUploadDownload documentsUpload) {

		return documentsUploadDownloadDao.saveDocumentsUploadDownload(documentsUpload);
	}

	@Transactional(readOnly = true)
	public List<Object[]> getFileIdAndNames() {

		return documentsUploadDownloadDao.getFileIdAndNames();
	}
	@Transactional(readOnly = true)
	public DocumentsUploadDownload getOneDocument(Integer id) {
		
		return documentsUploadDownloadDao.getOneDocument(id);
	}
}
