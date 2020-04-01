package siva.nit.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;
import siva.nit.model.WhUserType;

public class WhUserTypeExcelView extends AbstractXlsxView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// download and file name
		response.addHeader("Content-Disposition", "attachment;filename=WhUserTypeExcelData.xlsx");

		Sheet sheet = workbook.createSheet("WhUserData");

		// construct -row -0 (Header)
		setHeader(sheet);

		// read model data
		@SuppressWarnings("unchecked")
		List<WhUserType> list = (List<WhUserType>) model.get("showWhUserTypeExcelData");
		setBody(sheet, list);
	}

	// it will print only row number--0 (Header)
	private void setHeader(Sheet sheet) {
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("User ID");
		row.createCell(1).setCellValue("User CODE");
		row.createCell(2).setCellValue("User For");
		row.createCell(3).setCellValue("User Mail");
		row.createCell(4).setCellValue("User Contact");
		row.createCell(5).setCellValue("User Id Type");
		row.createCell(6).setCellValue("If Other");
		row.createCell(7).setCellValue("Id Number");
		

	}

	// it will print row number ---1 on words (Body--Cells)
	private void setBody(Sheet sheet, List<WhUserType> list) {
		int count = 1;
		for (WhUserType whUserType : list) {
			Row row = sheet.createRow(count++);
			row.createCell(0).setCellValue(whUserType.getWhUserTypeId());
			row.createCell(1).setCellValue(whUserType.getWhUserTypeCode());
			row.createCell(2).setCellValue(whUserType.getWhUserTypeFor());
			row.createCell(3).setCellValue(whUserType.getWhUserTypeMail());
			row.createCell(4).setCellValue(whUserType.getWhUserTypeContact());
			row.createCell(5).setCellValue(whUserType.getWhUserTypeIdType());
			row.createCell(6).setCellValue(whUserType.getWhUserTypeIfOther());
			row.createCell(7).setCellValue(whUserType.getWhUserTypeIdNumber());
			
		}

	}

}
