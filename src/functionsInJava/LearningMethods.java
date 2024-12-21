package functionsInJava;

public class LearningMethods {

    public int avgNumbers(int a , int b ){
        int avg = (a + b) / 2;
        return avg;
    }

    public void sqaureOfGivenNumber(int a ){
        int sqaure = a * a;
        System.out.println("Sqaure of Avg Numbers : "+sqaure);
    }

    public static void avgOfGivenNumber(int a ){
        int sqaure = a / 2;
        System.out.println("Sqaure of Avg Numbers : "+sqaure);
    }


    public static void main(String[] args) {
        LearningMethods learningMethods = new LearningMethods();

        learningMethods.sqaureOfGivenNumber(learningMethods.avgNumbers(6,6));

        avgOfGivenNumber(learningMethods.avgNumbers(6,6)); //only static method can in static context
    }

}

