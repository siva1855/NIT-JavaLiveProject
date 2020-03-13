package siva.nit.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import siva.nit.model.Part;


public class PartExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//download  and file name
				response.addHeader("Content-Disposition", "attachment;filename=PartExcelData.xlsx");
				
				Sheet sheet = workbook.createSheet("PartData");
				
				// construct -row -0 (Header)
				setHeader(sheet);
				
				// read model data
				@SuppressWarnings("unchecked")
				List<Part> list = (List<Part>) model.get("showPartExcelData");
				setBody(sheet, list);
			}

			// it will print only row number--0 (Header)
			private void setHeader(Sheet sheet) {
				Row row = sheet.createRow(0);
				row.createCell(0).setCellValue("PART ID");
				row.createCell(1).setCellValue("PART CODE");
				row.createCell(2).setCellValue("DIMENSION LENGTH");
				row.createCell(3).setCellValue("DIMENSION WIDTH");
				row.createCell(4).setCellValue("DIMENSION HEIGHT");
				row.createCell(5).setCellValue("BASE COST");
				row.createCell(6).setCellValue("BASE CURRENCY");
				row.createCell(7).setCellValue("DESCRIPTION");


			}

			// it will print row number ---1 on words (Body--Cells)
			private void setBody(Sheet sheet, List<Part> list) {
				int count = 1;
				for (Part part : list) {
					Row row = sheet.createRow(count++);
					row.createCell(0).setCellValue(part.getPartId());
					row.createCell(1).setCellValue(part.getPartCode());
					row.createCell(2).setCellValue(part.getPartDimensionLength());
					row.createCell(3).setCellValue(part.getPartDimensionWidth());
					row.createCell(4).setCellValue(part.getPartDimensionHeight());
					row.createCell(5).setCellValue(part.getPartBaseCost());
					row.createCell(6).setCellValue(part.getPartBaseCurrency());
					row.createCell(7).setCellValue(part.getPartDescription());
				}

			}

		
	}


