import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workbook workBook = null;
		
		try {
			workBook = Workbook.getWorkbook( new FileInputStream( "./lotto(1083).xls" ) );

			Sheet sheet = workBook.getSheet(0);
			
			int seq = sheet.getRows();

			// ( 열, 행 )
			Cell cell = sheet.getCell( 0, 0 );
			System.out.println( cell.getContents() );
			
			for( int i=0 ; i<seq ; i++ ) {
				cell = sheet.getCell( 1, i );
				System.out.print( cell.getContents() + "회\t");
				
				cell = sheet.getCell( 2, i );
				System.out.print( cell.getContents() + "\t");

				for( int j=13 ; j<20 ; j++ ) {
					cell = sheet.getCell( j, i );
					System.out.print( cell.getContents() + " " );
				}
				System.out.println();
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
