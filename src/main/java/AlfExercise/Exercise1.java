package AlfExercise;

public class Exercise1 {
    public static void main(String [] args){
        int n = 20;
        printFizzBuzzWithFor(n);
    }

    private static void printFizzBuzzWithFor(int n) {
        for(int i=1; i<=n; i++){
            if(Integer.toString(i).contains("3")){
                System.out.print("alfresco ");
            }
            else if(i%3==0 & i%5==0) {
                System.out.print("fizzbuzz ");
            }
            else if(i%5==0){
                System.out.print("buzz ");
            }
            else if(i%3==0){
                System.out.print("fizz ");
            }
            else System.out.print(i+ " ");
        }
    }

}
