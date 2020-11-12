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

        boolean pass = true;

        boolean student = false;
        boolean teacher = false;




        String name = null;
        out.println("Enter your name");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        out.printf("your name: %s" , name);
        keyboard.nextLine();

        float age = 0.0f;
        out.println("Enter your Age");
        age = keyboard.nextFloat();
        keyboard.nextLine();
        out.printf("your name: %f" , age);
        keyboard.nextLine();

        int idStudent = 0;
        out.println("Enter your ID the Student");
        idStudent = keyboard.nextInt();
        keyboard.nextLine();
        out.printf("your name: " , idStudent);



    }
}
