import java.util.Random;
import java.util.Arrays;
public class A {
    public static void main(String []args){

        int[] randomArray = new int[10];
        Random rnd = new Random();
        for(int i = 0; i<randomArray.length; i++  ){
            randomArray[i] = rnd.nextInt(101);
        }
        System.out.print(Arrays.toString(randomArray));
    }

}
