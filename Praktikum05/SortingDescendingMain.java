package Praktikum05;

public class SortingDescendingMain {
    public static void main(String[] args) {
        int firstNumber[] = {8, 6, 10, 2, 4};
        firstNumber = SortingDescending.bubbleSortDescending(firstNumber);
        SortingDescending.printArray(firstNumber);

        int secondNumber[] = {7, 9, 3, 11, 1};
        firstNumber = SortingDescending.bubbleSortDescending(secondNumber);
        SortingDescending.printArray(secondNumber);

        int thirdNumber[] = {4, 1, 12, 6, 5};
        firstNumber = SortingDescending.bubbleSortDescending(thirdNumber);
        SortingDescending.printArray(thirdNumber);
    }
}
