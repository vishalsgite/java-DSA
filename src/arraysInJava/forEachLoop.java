package arraysInJava;

public class forEachLoop {
    public static void main(String[] args) {

        String[] names = {"RAM","SHAM","KARAN","MONTY"};
        int[] sumofdigits = {1,2,5,6,8,9,10};
        int sum = 0;

//first way to define
        for(int i = 0; i < names.length ; i++){
          System.out.println("Name is : "+names[i]);
        }

//second way to define

        for(String name : names){
            System.out.println("Name is : "+name);
        }

        for(int number : sumofdigits){
            sum = number + sum;
            //sum += number;
        }
        System.out.println("Sum of numbers : " +sum);
    }
}
