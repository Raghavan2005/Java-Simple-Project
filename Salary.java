import java.util.Scanner;

 class Salary {
    public static void main(String[] arg ) {
        Scanner sn = new Scanner(System.in);
        double hw = sn.nextDouble();
        int hwpw = sn.nextInt();
        int weeksworked = sn.nextInt();
        if (hw < 0&&hwpw < 0&&weeksworked < 0) {
            System.out.println(" must be a positive value.");
            return;
        }

        double totalsalary = 0.0;

        for (int i = 0; i < weeksworked; i++) {
            double weeksalary = 0.0;

            if (hwpw > 40) {
                
                int overtim = hwpw - 40;
                double rpay = 40 * hw;
                double overtimepay = overtim * hw * 1.5;
                weeksalary = rpay + overtimepay;
            } else if (hwpw < 20) {
         
                weeksalary = hwpw * hw;
                weeksalary -= weeksalary * 0.10;
            } else {
             
                weeksalary = hwpw * hw;
            }

            totalsalary += weeksalary;
        }

        System.out.printf("Total salary is %.2f", totalsalary);
    }
}
