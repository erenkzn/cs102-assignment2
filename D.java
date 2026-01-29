public class D {

    public static int[] displayDiffer(int[] inputArray){
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

    public static void main(String[] args) {
        int[] array = {2, 6, 9, 3, 5};
        int[] differ = displayDiffer(array);
        for (int i = 0; i < differ.length; i++){
            System.err.print(differ[i] + " ");
        } 
    }

}