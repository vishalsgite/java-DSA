package Day_01;

import java.util.Scanner;

//Type Conversion and Type Casting
public class FourthProgram {
    /*
    When one type of data is assigned to another type of variable ,and automatic
    type conversion will take place if the following conditions are mate :

    1- two types must be compatiable
    2 - Destination type must be greater than source type
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();  //here try to give input 40 ( which is integer)
        System.out.println(num);        //but here we will get output as 40.0 ( which is float )

        /* NOTE : IF WE MODIFIY ABOVR CODE AS ,
        int num = input.nextFloat();  //here try to give input 40 ( which is integer)
        System.out.println(num);        //but here , we will get error ,because Destination type
                                         is not greater than source type .in this case Type Casting is needed .
         */

        //what is type casting ?  - > Compressing the bigger number is smaller type explicitly.

        int num1 = (int) 45.87f;

        System.out.println(num1);

    }
}
