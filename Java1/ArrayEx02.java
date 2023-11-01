public class ArrayEx02 {
    public static void main(String[] args)  {
        int[] arr1;
        arr1 = new int[3];

        arr1[0] = 10;
        arr1[1] = 10;
        arr1[2] = 10;

        // Compile 에러 X
        // Runtime 에러, Exception
        // ArrayIndexOutOfBoundsException
        // arr1[3] = 40;
        
        System.out.println( arr1[2] );
        // System.out.println( arr1[3] );
    }
}
