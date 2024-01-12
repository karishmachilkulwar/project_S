package excelUse;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
	
		
			
				FileInputStream myfile=new FileInputStream("C:\\Users\\HP\\Downloads\\Book1.xlsx");
				String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println("Row and column first data is "+value1);
				
				

	}

	}

