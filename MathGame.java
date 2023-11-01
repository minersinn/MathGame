import java.util.Scanner; // Import the Scanner class

public class MathGame {

    public static void main(String[] args) {
        Scanner scannerBoi = new Scanner(System.in); // Create a Scanner object
        Scanner answerScanner = new Scanner(System.in);
        String operator = ""; // Variable for user menu selection
        int number1 = 0;
        int number2 = 0;
        int answer = 0;
        int userAnswer = 0;
        byte lives = 3;
        byte correctAnswers = 0;

        System.out.println("Welcome to Math Games!");
        System.out.println("Select a game: ");
        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");

        operator = scannerBoi.nextLine(); // Read user input

        while (lives > 0 && correctAnswers < 10) {
            System.out.println(" ");
            System.out.println("You chose option " + operator);
            System.out.println("You have " + lives + " lives left and " + correctAnswers + " correct answers.");
            System.out.println(" ");

            switch (operator) {
                case "+":
                    number1 = (int) (Math.random() * 13); // 0 to 12
                    number2 = (int) (Math.random() * 13); // 0 to 12
                    answer = number1 + number2;
                    System.out.println(number1 + " " + operator + " " + number2 + " = ");
                    System.out.println("Submit your answer");
                    userAnswer = Integer.parseInt(answerScanner.nextLine());

                    if (userAnswer == answer) {
                        System.out.println("Correct");
                        System.out.println(" ");
                        ++correctAnswers;

                    } else {
                        --lives;
                        System.out.println("Incorrect");
                        System.out.println("The answer is " + answer);
                        System.out.println(" ");

                    }

                    break;

                case "-":
                    number1 = (int) (Math.random() * 13); // 0 to 12
                    number2 = (int) (Math.random() * 13); // 0 to 12
                    answer = number1 + number2;
                    System.out.println(answer + " " + operator + " " + number1 + " = ");
                    System.out.println("Submit your answer");
                    userAnswer = Integer.parseInt(answerScanner.nextLine());

                    if (userAnswer == number2) {
                        System.out.println("Correct");
                        System.out.println(" ");
                        ++correctAnswers;

                    } else {
                        --lives;
                        System.out.println("Incorrect");
                        System.out.println("The answer is " + number2);
                        System.out.println(" ");

                    }

                    break;

                case "*":
                    number1 = (int) (Math.random() * 13); // 0 to 12
                    number2 = (int) (Math.random() * 13); // 0 to 12
                    answer = number1 * number2;
                    System.out.println(number1 + " " + operator + " " + number2 + " = ");
                    System.out.println("Submit your answer");
                    userAnswer = Integer.parseInt(answerScanner.nextLine());

                    if (userAnswer == answer) {
                        System.out.println("Correct");
                        System.out.println(" ");
                        ++correctAnswers;

                    } else {
                        --lives;
                        System.out.println("Incorrect");
                        System.out.println("The answer is " + answer);
                        System.out.println(" ");

                    }

                    break;

                case "/":

                    number1 = (int) (Math.random() * 12 + 1); // 1 to 12
                    number2 = (int) (Math.random() * 12 + 1); // 1 to 12
                    answer = number1 * number2;
                    System.out.println(answer + " " + operator + " " + number1 + " = ");
                    System.out.println("Submit your answer");
                    userAnswer = Integer.parseInt(answerScanner.nextLine());

                    if (userAnswer == number2) {
                        System.out.println("Correct");
                        System.out.println(" ");
                        ++correctAnswers;

                    } else {
                        --lives;
                        System.out.println("Incorrect");
                        System.out.println("The answer is " + number2);

                    }

                    break;

                default:

                    break;

            }

        }

    }

}