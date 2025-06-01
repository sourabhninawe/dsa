import java.util.Scanner;

class CountDigits{
    public int approach1(int number){
        int numDigits = 0;
        while(number>0){
            numDigits++;
            number/=10;
        }
        return numDigits;
    }
    public int approach2(int number){
        if(number>0)
            return (int)Math.log10(number)+1;
        else
            return 0;
    }
   public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number(Integer):");
        int number = s.nextInt();
        CountDigits cd = new CountDigits();
        long startTime = System.currentTimeMillis();
        System.out.println("Number of digits: " + cd.approach1(number));
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Approach 1 took "+elapsedTime+" milli seconds to execute.");

        startTime = System.currentTimeMillis();
        System.out.println("Number of digits: " + cd.approach2(number));
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Approach 2 took "+ elapsedTime+" milli seconds to execute.");
   }
}