package Praktikum05;
public class SortingDescending {
    public static int[] bubbleSortDescending(int[] numbers){
        int n = numbers.length;

        for(int i = 0; i< n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if (numbers[j] < numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    public static int[] selectionSortDescending(int[] numbers){
        int n = numbers.length;

        for(int i = 0; i < n - 1; i++){
            int maxIndex = i;

            for(int j = 0; i < n-1; i++){
                if (numbers[j] > numbers[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = numbers[maxIndex];
            numbers[maxIndex] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }
    public static int[] insertionSortDescending(int[] numbers){
        int n = numbers.length;

        for(int i = 1; i < numbers.length; i++){
            int key = numbers[i];
            int j = i - 1;

            while(j >= 0 && numbers[j] < key){
                numbers[j + 1] = numbers[j];
                j = j -1;
            }
            numbers [ j + i] = key;
        }
        return numbers;
    }
    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }
}
