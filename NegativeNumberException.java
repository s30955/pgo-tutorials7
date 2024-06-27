import java.util.Scanner;

public class NegativeNumberException extends Exception {

    private int[] numbers = new int[10];
    public NegativeNumberException(String negativeNumbersAreNotAllowed) {
        super(negativeNumbersAreNotAllowed);
    }

    public int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int number = scanner.nextInt();
        if(number<0){
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public void fillArray(){
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println(e.getMessage());
            }
        }
    }
}
