public class PrintAllElements{
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printElements(arr);
    }

    public static void printElements(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }
}