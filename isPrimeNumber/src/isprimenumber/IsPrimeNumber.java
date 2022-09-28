package isprimenumber;

public class IsPrimeNumber {

    public static void main(String[] args) {
        int number = 23;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Number is not prime");
            return;
        }

        if (number < 1) {
            System.out.println("Invalid number");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }

}
