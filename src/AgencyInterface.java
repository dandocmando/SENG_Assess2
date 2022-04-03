import java.util.*;

public class AgencyInterface 
{
    private void run()
    {
       Scanner console = new Scanner(System.in);
       Couple c = new Couple();
       int      age,end;
       String   name;
       
       do {
           System.out.println("first person: ");
           System.out.println("name: ");
           name = console.next();
           int is_over_18;
           int increment = 0;

           do {
               if(increment == 0)
               {
                   System.out.print("age: ");
               }
               else
               {
                   System.out.print("Please enter an age 18 or over: ");
               }
               age = console.nextInt();
               is_over_18 = inputAge(age);
               increment=increment+1;
           }
           while (is_over_18 != 1);

           c.addData(1, name, age);
           System.out.println("second person: ");
           System.out.println("name: ");
           name = console.next();
           increment = 0;
           do {
               if(increment == 0)
               {
                   System.out.print("age: ");
               }
               else
               {
                   System.out.print("Please enter an age 18 or over: ");
               }
               age = console.nextInt();
               is_over_18 = inputAge(age);
               increment=increment+1;
           }
           while (is_over_18 != 1);

           c.addData(2, name, age);
           System.out.println(c.printCouple());
           System.out.println("********************");
           System.out.println(c.test());
           System.out.println("********************");
           System.out.print("Quit? (0)yes (1)no: ");
           end = console.nextInt();
       }
       while (end!=0);

    }
    public static void main(String[] args)
    {
           AgencyInterface agency = new AgencyInterface ();
           agency.run();
    }


    public int inputAge(int ageInput)
    {

        if(ageInput >= 18)
        {
            return 1;
        }

        else
        {
            return 0;

        }

    }

    }