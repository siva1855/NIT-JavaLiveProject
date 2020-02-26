package siva.nit.dao;

import java.util.List;

import siva.nit.model.DocumentsUploadDownload;

public interface DocumentsUploadDownloadDao {

	public Integer saveDocumentsUploadDownload(DocumentsUploadDownload documentsUpload);
	
	public List<Object[]> getFileIdAndNames();
	
	public DocumentsUploadDownload getOneDocument(Integer id);
}
