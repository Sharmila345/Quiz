package quiz;
import java.util.Random;
import java.util.Scanner;

// Question class to store question, options, and answer
class Question {
    String question;
    String[] options;
    char answer;

    public Question(String question, String[] options, char string) {
        this.question = question;
        this.options = options;
        this.answer = string;
    }
}

public class Quiz {
    public static void main(String[] args) {
        // Create a question bank
        Question[] questions = new Question[] {
            
            new Question("1.What is the purpose of the 'private' access modifier in Java?", new String[] {"To allow access to a variable or method from any class", "To restrict access to a variable or method to the same class only", "To allow access to a variable or method from any subclass", "To restrict access to a variable or method to the same package only"},'b'),
            new Question("2.What is the difference between 'try'-catch' and 'try'-catch'-finally' blocks in Java?", new String[] {"try'-catch' is used for checked exceptions, while 'try'-catch'-finally' is used for unchecked exceptions", "try'-catch' is used for error handling, while 'try'-catch'-finally' is used for resource management", "try'-catch'-finally' is used for checked exceptions, while 'try'-catch' is used for unchecked exceptions", "try'-catch'-finally' is used for error handling and resource management, while 'try'-catch' is used for error handling only"}, 'd'),
            new Question("3.What is the purpose of the 'synchronized' keyword in Java?", new String[] {"To allow multiple threads to access a shared resource simultaneously", "To prevent multiple threads from accessing a shared resource simultaneously", "To improve the performance of multithreaded programs", "To reduce the memory usage of multithreaded programs"}, 'b'),
            new Question("4.What is the result of the expression '5 % 2' in Java?", new String[] {"1", "2", "3", "4"}, 'a'),

            new Question("5.What is the output of the following Java code? int[] arr = {1, 2, 3, 4, 5}; System.out.println(arr[2]);",
                new String[] {"1", "2", "3", "4"}, 'c'),
            new Question("6.How do you initialize a multidimensional array in Java?",
                new String[] {"int[][] arr = new int[3][4];", "int[] arr = new int[3][4];", "int[][] arr = new int[3, 4];", "int[] arr = new int[3, 4];"}, 'a'),
            
            new Question("7.What is the output of the following Java code? String str = \"Hello\"; System.out.println(str.substring(2));",
                new String[] {"Hello", "llo", "He", "l"},'b'),
            new Question("8.How do you concatenate two strings in Java?",
                new String[] {"Using the + operator", "Using the concat() method", "Using the join() method", "Using the append() method"}, 'a'),

            new Question("9.What is the main purpose of encapsulation in object-oriented programming?",
                new String[] {"To hide data from other classes", "To expose data to other classes", "To provide a way to access data", "To provide a way to modify data"},'a'),
            new Question("10.What is the difference between method overloading and method overriding in Java?",
                new String[] {"Method overloading is when multiple methods have the same name but different parameters, while method overriding is when a subclass provides a different implementation of a method in its superclass.",
                "Method overloading is when a subclass provides a different implementation of a method in its superclass, while method overriding is when multiple methods have the same name but different parameters.",
                "Method overloading and method overriding are the same thing.",
                "Method overloading is used for operator overloading, while method overriding is used for function overloading."},'a'),
            new Question("11.What is the purpose of an abstract class in Java?",
                new String[] {"To provide a complete implementation of a class", "To provide a partial implementation of a class that can be inherited by subclasses", "To declare a class that cannot be instantiated", "To declare a class that can only be accessed within the same package"},'b'),
            new Question("12.What is the main difference between an interface and an abstract class in Java?",
                new String[] {"An interface can have state, while an abstract class cannot", "An interface can have behavior, while an abstract class cannot", "An interface is abstract by default, while an abstract class is not", "An interface cannot be implemented, while an abstract class can be extended"},'c'),

            new Question("13.What is the main purpose of the ArrayList class in Java?",
                new String[] {"To provide a way to store and manipulate a fixed-size array", "To provide a way to store and manipulate a dynamic-size array", "To provide a way to store and manipulate a linked list", "To provide a way to store and manipulate a stack"}, 'b'),
            new Question("14.How do you add an element to a HashSet in Java?",
                new String[] {"Using the add() method", "Using the put() method", "Using the insert() method", "Using the append() method"}, 'a'),
            new Question("15.What is the main difference between a HashSet and a TreeSet in Java?",
                new String[] {"A HashSet is sorted, while a TreeSet is not", "A HashSet is not sorted, while a TreeSet is", "A HashSet is faster, while a TreeSet is slower", "A HashSet is slower, while a TreeSet is faster"},'b')
        };

        // Initialize score and random number generator
        int score = 0;
//        Random random = new Random();

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            // Select the current question from the question bank
            Question question = questions[i];
            boolean validAnswer = false;

            while (!validAnswer) {
                // Display question and options
                System.out.println(question.question);
                for (int j = 0; j < question.options.length; j++) {
                    System.out.println((char)('A' + j) + ") " + question.options[j]);
                }

                
                // Get user answer
                System.out.print("Enter your answer (A-D): ");
                String userAnswer = scanner.next().trim().toUpperCase();
                
//                if (Character.isLowerCase(userAnswer.charAt(0))) {
//                    userAnswer = userAnswer.toUpperCase();
//                }
                
                if (userAnswer.matches("[ABCD]")) {
                    validAnswer = true;
                    // Check if answer is correct
                    if (Character.toLowerCase(userAnswer.charAt(0))==question.answer) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Incorrect. The correct answer is " + question.answer);
                    }
                } else {
                    System.out.println("Invalid answer. Please enter A, B, C, or D.");
                }
            }
        }
// Display total score
        System.out.println("\nQauiz completed! Your total score is: " + score + "/" + questions.length);
    }
}
    
