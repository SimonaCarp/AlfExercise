package AlfExercise;

public class Exercise1 {
    public static void main(String [] args){
        int n = 20;
        printFizzBuzzWithFor(n);
    }

    private static void printFizzBuzzWithFor(int n) {
        int integerCount = 0;
        int alfrescoCount = 0;
        int fizzbuzzCount = 0;
        int buzzCount = 0;
        int fizzCount = 0;
        for(int i=1; i<=n; i++){
            if(Integer.toString(i).contains("3")){
                System.out.print("alfresco ");
                alfrescoCount++;
            }
            else if(i%3==0 & i%5==0) {
                System.out.print("fizzbuzz ");
                fizzbuzzCount++;
            }
            else if(i%5==0){
                System.out.print("buzz ");
                buzzCount++;
            }
            else if(i%3==0){
                System.out.print("fizz ");
                fizzCount++;
            }
            else {
                System.out.print(i + " ");
                integerCount++;
            }
        }
        System.out.println();
        System.out.println("fizz " + fizzCount + ", buzz " + buzzCount + ", fizzbuzz "
                + fizzbuzzCount + ", alfresco " + alfrescoCount
                + ", integer " + integerCount
        );
    }

}
