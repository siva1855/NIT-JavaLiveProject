package siva.nit.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;
import siva.nit.model.Uom;

public class UomExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// download and file name
		response.addHeader("Content-Disposition", "attachment;filename=UomExcelData.xlsx");

		Sheet sheet = workbook.createSheet("UomData");

		// construct -row -0 (Header)
		setHeader(sheet);

		// read model data

		@SuppressWarnings("unchecked")
		List<Uom> list = (List<Uom>) model.get("showUomExcelData");
		setBody(sheet, list);
	}

	// it will print only row number--0 (Header)
	private void setHeader(Sheet sheet) {
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Uom ID");
		row.createCell(1).setCellValue("Uom TYPE");
		row.createCell(2).setCellValue("Uom MODEL");
		row.createCell(3).setCellValue("DESCRIPTION");

	}

	// it will print row number ---1 on words (Cells)
	private void setBody(Sheet sheet, List<Uom> list) {
		int count = 1;
		for (Uom uom : list) {
			Row row = sheet.createRow(count++);
			row.createCell(0).setCellValue(uom.getUomId());
			row.createCell(1).setCellValue(uom.getUomType());
			row.createCell(2).setCellValue(uom.getUomModel());
			row.createCell(3).setCellValue(uom.getUomDescription());
		}

	}

}
