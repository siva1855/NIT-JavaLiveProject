package siva.nit.view.pdf;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import siva.nit.model.WhUserType;

public class WhUserTypePdfView extends AbstractPdfView{
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// download and file name
		response.addHeader("Content-Disposition", "attachment;filename=WhUserTypePdfData.pdf");
		
		// create element
		Paragraph paragraph = new Paragraph("Welcome To WhUserType");
		
		// add element to document
		document.add(paragraph);
		
		// read data from model
		@SuppressWarnings("unchecked")
		List<WhUserType> list = (List<WhUserType>) model.get("showWhUserTypePdfData");
		
		// creating table with number of columns
		PdfPTable pdfPTable = new PdfPTable(8);
		pdfPTable.addCell("User ID");
		pdfPTable.addCell("User Type");
		pdfPTable.addCell("User Code");
		pdfPTable.addCell("User For");
		pdfPTable.addCell("User Mail");
		pdfPTable.addCell("User Contact");
		pdfPTable.addCell("User Id Type");
		pdfPTable.addCell("If Other");
		pdfPTable.addCell("Id Number");

		// adding data to table
		for (WhUserType whUserType : list) {
			pdfPTable.addCell(whUserType.getWhUserTypeId().toString());
			pdfPTable.addCell(whUserType.getWhUserType());
			pdfPTable.addCell(whUserType.getWhUserTypeCode());
			pdfPTable.addCell(whUserType.getWhUserTypeFor());
			pdfPTable.addCell(whUserType.getWhUserTypeMail());
			pdfPTable.addCell(whUserType.getWhUserTypeContact().toString());
			pdfPTable.addCell(whUserType.getWhUserTypeIdType());
			pdfPTable.addCell(whUserType.getWhUserTypeIfOther());
			pdfPTable.addCell(whUserType.getWhUserTypeIdNumber().toString());
		}
		// add table to document
		document.add(pdfPTable);
		
		// print date and Time
		document.add(new Paragraph(new Date().toString()));

	}
}
