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
    }
}
