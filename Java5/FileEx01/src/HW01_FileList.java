import java.io.File;

public class HW01_FileList {
    public static void main(String[] args) {
        File dir = new File( args[0] );

        File[] list = dir.listFiles();

        for( File str : list ) {
//            System.out.println( str.getName() );
        	if( str.isDirectory() ) {
        		System.out.println( "[" + str.getName() + "]" );
        	} else {
        		System.out.println( str.getName() );
        	}
        }
    }
}

/*
01. JavaEx01, StringEx01, Util.txt
02. Abstraction.txt
03. Exception, ArrayList, List, Set.txt
04. Hash, DataList, Text, File.txt
dir1
eclipse
eclipse-jee-2023-06-R-win32-x86_64.zip
java-workspace
test1.txt
test2.txt
*/

// ==>


/*
01. JavaEx01, StringEx01, Util.txt
02. Abstraction.txt
03. Exception, ArrayList, List, Set.txt
04. Hash, DataList, Text, File.txt
[dir1]
[eclipse]
eclipse-jee-2023-06-R-win32-x86_64.zip
[java-workspace]
test1.txt
test2.txt
*/