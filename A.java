import java.util.Random;
public class A {
    public int[] generateArray(int size){
        int[] randomArray = new int[size];
        Random rnd = new Random();
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = rnd.nextInt(101);
        }
        return randomArray;
    }
}
