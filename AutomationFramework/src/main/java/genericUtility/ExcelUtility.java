package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
 
	public RichTextString getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./srs/test/resources/TestData/selenium.xlsx");
Workbook wb=WorkbookFactory.create(fis);
return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getRichStringCellValue();

}

	}
