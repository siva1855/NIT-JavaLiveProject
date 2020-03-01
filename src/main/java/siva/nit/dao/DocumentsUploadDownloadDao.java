package siva.nit.dao;

import java.util.List;

import siva.nit.model.DocumentsUploadDownload;

public interface DocumentsUploadDownloadDao {

	public Integer saveDocumentsUploadDownload(DocumentsUploadDownload documentsUploadDownload);
	
	public List<Object[]> getFileIdAndNames();
	
	public DocumentsUploadDownload getOneDocument(Integer id);
}
