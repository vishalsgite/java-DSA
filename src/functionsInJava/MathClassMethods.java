package functionsInJava;

public class MathClassMethods {

public void getRandomNumber(){
    int randomNum = (int) (Math.random()*6);
    System.out.println("Random Number  : " +randomNum);
}


    public static void main(String[] args) {
        MathClassMethods mathClassMethods = new MathClassMethods();
        mathClassMethods.getRandomNumber();


        System.out.println(Math.min(5,6));
        System.out.println(Math.max(5,6));
        System.out.println(Math.sqrt(6));
        System.out.println(Math.pow(5,6));
        System.out.println(Math.abs(5));
        System.out.println(Math.random());
        System.out.println(Math.floor(5.666844746));  //ans - 5
        System.out.println(Math.ceil(6.2578));        //ans - 7
        System.out.println(Math.round(2.87462));      //ans - 3
    }
}
