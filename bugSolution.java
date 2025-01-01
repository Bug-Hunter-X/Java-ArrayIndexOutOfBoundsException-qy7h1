public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 2; //Example safe index
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}