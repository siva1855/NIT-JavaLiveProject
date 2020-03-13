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

import siva.nit.model.Part;

public class PartPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// download and file name
				response.addHeader("Content-Disposition", "attachment;filename=PartPdfData.pdf");
				
				// create element
				Paragraph paragraph = new Paragraph("Welcome To Part");
				
				// add element to document
				document.add(paragraph);
				
				// read data from model
				@SuppressWarnings("unchecked")
				List<Part> list = (List<Part>) model.get("showPartPdfData");
				
				// creating table with number of columns
				PdfPTable pdfPTable = new PdfPTable(8);
				pdfPTable.addCell("PART ID");
				pdfPTable.addCell("PART CODE");
				pdfPTable.addCell("DIMENSION LENGTH");
				pdfPTable.addCell("DIMENSION WIDTH");
				pdfPTable.addCell("DIMENSION HEIGHT");
				pdfPTable.addCell("BASE COST");
				pdfPTable.addCell("BASE CURRENCY");
				pdfPTable.addCell("DESCRIPTION");

				// adding data to table
				for (Part part : list) {
					pdfPTable.addCell(part.getPartId().toString());
					pdfPTable.addCell(part.getPartCode());
					pdfPTable.addCell(part.getPartDimensionLength().toString());
					pdfPTable.addCell(part.getPartDimensionWidth().toString());
					pdfPTable.addCell(part.getPartDimensionHeight().toString());
					pdfPTable.addCell(part.getPartBaseCost().toString());
					pdfPTable.addCell(part.getPartBaseCurrency());
					pdfPTable.addCell(part.getPartDescription());
					
				}
				// add table to document
				document.add(pdfPTable);
				
				// print date and Time
				document.add(new Paragraph(new Date().toString()));

			}
		
	}

