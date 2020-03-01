package siva.nit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import siva.nit.model.DocumentsUploadDownload;
import siva.nit.service.DocumentsUploadDownloadService;

@Controller
@RequestMapping("/documents")
public class DocumentsUploadDownloadController {

	@Autowired
	private DocumentsUploadDownloadService documentsUploadDownloadService;

	// 1.Show Document Upload Page
	@RequestMapping("/show")
	public String showDocumentsUploadPage(Model model) {
		List<Object[]> list = documentsUploadDownloadService.getFileIdAndNames();
		model.addAttribute("showDocumentsUploadData", list);
		return "DocumentsUploadDownload";
	}

	// 2.Upload Documents into DataBase
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String doUpload(@RequestParam Integer fileId, @RequestParam CommonsMultipartFile fileObject) {

		if (fileObject != null) {
			DocumentsUploadDownload documentsUploadDownload = new DocumentsUploadDownload();
			documentsUploadDownload.setFileId(fileId);
			documentsUploadDownload.setFileName(fileObject.getOriginalFilename());
			documentsUploadDownload.setFileData(fileObject.getBytes());
			documentsUploadDownloadService.saveDocumentsUploadDownload(documentsUploadDownload);
		}
		return "redirect:show";
	}

	// 3.Download One Document
	@RequestMapping("/download")
	public void doDownload(@RequestParam Integer fid, HttpServletResponse response) {
		// read one Object based on ID
		DocumentsUploadDownload documentsUploadDownload = documentsUploadDownloadService.getOneDocument(fid);
		response.addHeader("Content-Disposition", "attachment;filename=" + documentsUploadDownload.getFileName());

		try {
			// copy data to OutPutStream
			FileCopyUtils.copy(documentsUploadDownload.getFileData(), response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
