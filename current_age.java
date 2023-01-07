import java.lang.*;
import java.util.Scanner;

public class learn{
    public static void main(String[] args)
    {
        int cuyear=2022,bbyear,cuage;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Brith year");
        bbyear=in.nextInt();
        cuage=cuyear-bbyear;
        System.out.println("Your Current Age is "+cuage);

    }
}
