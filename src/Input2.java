import java.util.Scanner;
//help
public class Input2
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("What's you're first name? ");
        String str1= sc.nextLine();
        System.out.print("You're first name is: "+str1);


        System.out.print("What's you're last name? ");
        String str2= sc.nextLine();

        System.out.print("You're last name is: "+str2);
    }
}