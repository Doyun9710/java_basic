import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LottoEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Workbook workBook = null;

		try {
			workBook = Workbook.getWorkbook( new FileInputStream( "./lotto(1083).xls" ) );

			Sheet sheet = workBook.getSheet(0);
			
			int seq = sheet.getRows();

			Cell cell = sheet.getCell( 0, 0 );
			
			for( int i=3 ; i<seq ; i++ ) {
				ArrayList<Integer> eNum = new ArrayList<Integer>();
				ArrayList<Integer> oNum = new ArrayList<Integer>();
				
				cell = sheet.getCell( 1, i );
				System.out.print( cell.getContents() + "회\t");
				
				cell = sheet.getCell( 2, i );
				System.out.print( cell.getContents() + "\t");

				for( int j=13 ; j<20 ; j++ ) {
					cell = sheet.getCell( j, i );
					int num = Integer.parseInt(cell.getContents());
					if( num%2 == 0 ) {
						eNum.add(num);
					} else {
						oNum.add(num);
					}
//					System.out.print( num + " " );
				}
				// System.out.println( "짝수 : " + eNum.toString() + "\t\t홀수 : " + oNum.toString() );
				
				System.out.print( "짝수 : ");
				for( int j=0 ; j<eNum.size() ; j++ ) {
					System.out.print( eNum.get(j) + " " );
				}
				System.out.print( "\t\t");
				System.out.print( "홀수 : ");
				for( int j=0 ; j<oNum.size() ; j++ ) {
					System.out.print( oNum.get(j) + " " );
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
