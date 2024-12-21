package Day_01;

public class firstProgram {

    /* Every File ends with .java is a class . class is basically named group of properties and functions
     main class (firstProgram ) in the this file is must be a public class
  &  function is just a collection of code ,that we can use again and again
     */

    public static void main(String[] args) {

        System.out.println("Hello Word");

        /*
        when compile this , it will not directly compile to machine code , first it will compile into byte code
       -->  firstProgram.class

       static --> static variables and functions are not depends on objects , so this method will get call
                 even we have not created object of firstProgram class . we want to run this main function without
                 creating object of class firstProgram .

                 main function is the entry of code , so even after we decide to first create object of class
                 & then run main method (for ex. firstProgram.main() ) , that would be not possible .because,
                  absence of entry point function .

                  String[] args - command line arguments
                  it is just a collection of string , that is array of String . it will stored whataever argument
                  we will pass it will stored in array .
                  like , args[0] , args[1] , .. and so on.
         */

    }
}
