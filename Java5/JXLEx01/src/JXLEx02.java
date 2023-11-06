import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workbook workBook = null;
		
		try {
			workBook = Workbook.getWorkbook( new FileInputStream( "./jxlrwtest.xls" ) );
			
			// sheet 접근
			Sheet sheet = workBook.getSheet(0);
			System.out.println( sheet.getName() );	// 1번째 sheet 이름
			System.out.println( sheet.getRows() );
			System.out.println( sheet.getColumns() );
			
			// ( 열, 행 )
			Cell cell = sheet.getCell( 0, 0 );
			System.out.println( cell.getContents() );
			
			for( int i=0 ; i<=10 ; i++ ) {
				cell = sheet.getCell( 0, i );
				System.out.println( cell.getContents() );
			}
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
