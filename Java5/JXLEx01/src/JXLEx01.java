import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workbook workBook = null;
		
		try {
			workBook = Workbook.getWorkbook( new FileInputStream( "./jxlrwtest.xls" ) );
			
			System.out.println( workBook.getVersion() );
			
			System.out.println( workBook.getNumberOfSheets() );
			
			String[] sheetNames = workBook.getSheetNames();
			System.out.println( Arrays.toString( sheetNames ) );
		} catch (BiffException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( workBook != null ) workBook.close();
		}
	}

}
