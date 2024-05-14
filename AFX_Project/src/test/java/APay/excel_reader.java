package APay;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_reader {

	public static void main(String[] args) throws InvalidFormatException {
		// TODO Auto-generated method stub
		
		try {
	         // Load the Excel file
	         FileInputStream file = new FileInputStream("F:\\AFX Login creds\\AFX_Login_creds.xlsx");
	         Workbook workbook = WorkbookFactory.create(file);
	         
	         // Get the first sheet
	         Sheet sheet = workbook.getSheetAt(0);
	         
	         // Iterate through each row
	         for (Row row : sheet) {
	             // Assuming the columns are in order: customerID, username, password
	             String customerID = row.getCell(0).getStringCellValue();
	             String username = row.getCell(1).getStringCellValue();
	             String password = row.getCell(2).getStringCellValue();
	             
	             // Do something with the data (print it for now)
	             System.out.println("Customer ID: " + customerID + ", Username: " + username + ", Password: " + password);
	         }
	         
	         // Close the file
	         file.close();
	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	 }

	}


