package studio1;
import support.cse131.ArgsProcessor;


public class Average
{
    public static void main(String[] args)
    {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1= ap.nextInt("The first of two integers to be averaged?");
        double n2= ap.nextInt("The second of two integers to be averaged?");
        double n3 = (n1 + n2)/2.0;
        System.out.println(n3);
    }

}
