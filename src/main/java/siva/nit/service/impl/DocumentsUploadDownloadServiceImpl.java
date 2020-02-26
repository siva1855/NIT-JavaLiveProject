package siva.nit.service.impl;

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

}
