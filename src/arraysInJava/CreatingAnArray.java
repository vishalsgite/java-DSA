package arraysInJava;

public class CreatingAnArray {

    public static void main(String[] args) {
        //both are valid declaration

        int array1[] ;
        int[] array2;

        //allocation memory to Array
        array1 = new int[5];
        array2 = new int[10];

        int[] array3 = new int[15];
        int[] array4 = {0,1,2,2,5,5,8,8,9,6,};

        array1[0] = 5;
        array1[1] = 6;
        array1[2] = 7;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);    //Default Value 0 ;
        System.out.println(array1[4]);    //Default Value 0 ;

        System.out.println("Size of Length " +array1.length);

        System.out.println(array4[0]);
        System.out.println(array4[1]);
        System.out.println(array4[2]);
        System.out.println(array4[3]);
        System.out.println(array4[4]);
        System.out.println(array4[5]);



    }
}
