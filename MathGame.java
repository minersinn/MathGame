import java.util.Scanner;


public class MathGame {

    static Scanner myScanner = new Scanner(System.in); // Create a Scanner object
    static byte lives = 3;
    static byte correctAnswers = 0;
    static String difficultyLevel; // Variable for user menu selection
    static int number1;
    static int number2;
    static int answer;
    static int userAnswer;
    static String userName;
    
    public static void main(String[] args) {

        System.out.println("What is your name?");
        // userName = myScanner.nextLine();
        userName = "CharMelia";
        System.out.println("Hello!, " + userName + "! It is nice to meet you.");
        System.out.println("Please choose a difficulty:");
        System.out.println("1 = Add and Subtract");
        System.out.println("2 = Multiplication");
        System.out.println("3 = Multiplication and Division");
        System.out.println("4 = Long Division");
        difficultyLevel = myScanner.nextLine(); // Read user input

        while (!difficultyLevel.equals("1") && !difficultyLevel.equals("2") && !difficultyLevel.equals("3") && !difficultyLevel.equals("4")) {
            System.out.println("Invalid choice. Please type 1, 2, 3, or 4");
            difficultyLevel = myScanner.nextLine();
        }
       
        
        while (lives > 0 && correctAnswers < 10) {
            System.out.println(" ");
            System.out.println("You have " + lives + " lives left and " + correctAnswers + " correct answers.");
            System.out.println(" ");
            
            switch (difficultyLevel) {
                case "1":
                    addSubtract();
                    break;
    
                case "2":
                    multiplication();
                    break;
    
                case "3":
                    multiplicationDivision();
                    break;
    
                case "4":
                    longDivision();
                    break;
            
            }
        }
        
        if (lives == 0) {
            System.out.println("You ran out of lives");
            restart();
        } else if (correctAnswers == 10){
            System.out.println("Great Job, " + userName + "! You got 10 correct. Keep up the good work.");
            restart();
        }
    }

    static void addSubtract(){
        number1 = (int) (Math.random() * 13); // 0 to 12
        number2 = (int) (Math.random() * 13); // 0 to 12
        int operator = (int) (Math.random() * 10);
        
        if (operator > 5) { // + operator
            answer = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = ");
            userAnswer = Integer.parseInt(myScanner.nextLine());
            System.out.println("The answer is " + answer);
            if (userAnswer == answer) {
                System.out.println("You are correct.");
                correctAnswers ++;
            } else {
                System.out.println("You are incorrect.");
                lives --;  
            } 
        } else {  // - operator
            
            number2 = answer - number1;
            System.err.println(answer + " - " + number1 + " = ");
            userAnswer = Integer.parseInt(myScanner.nextLine());
            System.out.println("The answer is " + number2);
            if (userAnswer == number2) {
                System.out.println("You are correct.");
                correctAnswers ++;
            } else {
                System.out.println("You are incorrect.");
              lives --;  
            } 
        }

    }
    static void multiplication(){
        System.out.println("test multiplication");        
        lives --;
    }
    static void multiplicationDivision(){
        System.out.println("test multiplication/division");        
        lives --;
    }
    static void longDivision(){
        System.out.println("test long divison");
        lives --;
    }
    
    static void restart(){
        String playAgain;
    
        System.out.println("Do you want to play again? Y/N");
        playAgain = myScanner.nextLine().toUpperCase();
        System.out.println(playAgain);
    
        if (playAgain.equals("Y")) {
            lives = 3;
            correctAnswers = 0;
            main(null);
        } else if (playAgain.equals("N")) {
            myScanner.close();
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid choice. Please choose \"Y\" or \"N\"");
            restart();
        };
    }
}

//add function to write username/data to a file 