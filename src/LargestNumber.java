import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int a = 0;
            int i;

            System.out.println("How many numbers do you want to enter?  :");
            int number = input.nextInt();

            for(i=1;i<=number;i++){
                System.out.println("Please enter a number: ");
                int n = input.nextInt();
                System.out.println("Number "+ i + ":  " + n);
                if(n>a){
                    a = n;
                }

            }
            System.out.println("Largest number entered: "+ a);

        }
    }

