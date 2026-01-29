
import java.util.Scanner;

public class B {
    private static void printGUI(){
        //think about the interface and which method would be the first
        System.out.printf("%s \n%s\n%s\n%s\n%s\n%s\n%s\n%s\n","-".repeat(10) , "1- Display the Difference of Array" , "2- Find Minimum ","3- Find Maximum ",
                "4- Find the Sum of Odd Elements", "5- Find the Sum of Even Elements","6- Exit", "-".repeat(10));
    }
    public static void print(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Give an array size: ");
        while (!in.hasNextInt()) {
            System.out.println("Try an integer value between 0-100");
            in.nextLine();
        }
        
        int size = in.nextInt();
        
        int[] inputArray = A.generateArray(size);
        System.out.print("\nThe generated array: ");
        print(inputArray);
        int choice=0;
        do{
            printGUI();
            
            
            while (!in.hasNextInt()) {
                System.out.println("Try an integer value between 1-6");
                in.nextLine();
            }
            choice = in.nextInt();
            if(choice ==1){
                
                int[] differ = D.getDifferArray(inputArray);
                for (int i = 0; i < differ.length; i++){
                    System.out.print(differ[i] + " ");
                } 
            }else if (choice == 2){
                System.out.print("The minimum element of ");
                print(inputArray);
                System.out.println("is :"+ C.findMinimum(inputArray));
            }else if(choice == 3){
                System.out.print("The maximum element of ");
                print(inputArray);
                System.out.println("is :"+ C.findMaximum(inputArray));
            }else if(choice == 4){
                System.out.println("Sum of odd elemets is :" + E.sumEvenOdd(inputArray, true));

            }else if(choice == 5){
                System.out.println("Sum of odd elemets is :" + E.sumEvenOdd(inputArray, false));
            }else{

            }

        }while(choice!=6);
        System.out.println("You have been succesfully logged off");
    }        
}
