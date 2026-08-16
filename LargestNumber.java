public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 55};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }

        int sum = largest + secondLargest;

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
        System.out.println("Sum of the two largest numbers: " + sum);
    }
}
