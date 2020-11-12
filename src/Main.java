/**
 *@filipe pereira
 *
 */

import java.util.Scanner;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args)
    {
        String name = null;
        Scanner keyboard = new Scanner(System.in);
        out.println("Enter your name");
        name = keyboard.nextLine();
        out.printf("your name: %s" , name);
        keyboard.nextLine();

        float age = 0.0f;
        out.println("Enter your Age");
        age = keyboard.nextFloat();
        keyboard.nextLine();
        out.printf("your name: %s" , age);
        keyboard.nextLine();

        int idStudent = 0;
        out.println("Enter your ID the Student");
        idStudent = keyboard.nextInt();
        keyboard.nextLine();
        out.printf("your name: %s" , idStudent);

    }
}
