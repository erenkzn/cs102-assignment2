public class D {
    public static int[] getDifferArray(int[] inputArray){
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++){
            sum += inputArray[i];
        }
        int avg = sum / inputArray.length;

        int[] differArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++){
            differArray[i] = inputArray[i] - avg;
        }

        return differArray;
    }
}