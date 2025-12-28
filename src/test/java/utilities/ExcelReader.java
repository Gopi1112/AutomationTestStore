package utilities;

	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import java.io.FileInputStream;
	import java.util.ArrayList;
	import java.util.List;

	public class ExcelReader {

	    private static final String FILE_PATH =
	            ".//testData/testdataprovider.xlsx";

	    public static Object[][] getData(String sheetName) {

	        Object[][] data = null;

	        try (FileInputStream fis = new FileInputStream(FILE_PATH);
	             Workbook workbook = new XSSFWorkbook(fis)) {

	            Sheet sheet = workbook.getSheet(sheetName);
	            int rows = sheet.getPhysicalNumberOfRows();
	            int cols = sheet.getRow(0).getPhysicalNumberOfCells();

	            data = new Object[rows - 1][cols];

	            for (int i = 1; i < rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return data;
	    }
	}



