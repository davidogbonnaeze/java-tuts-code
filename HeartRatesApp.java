import java.util.Scanner;
import java.util.Arrays;
public class HeartRatesApp {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int day;
        int month;
        int year;
        String firstname;
        String lastname;
        
        System.out.println(" Enter Firstname:");
        firstname = input.nextLine();
        System.out.println(" Enter Lastname:");
        lastname = input.nextLine();
        System.out.println("Enter your Birth day(e.g 21):");
        day = input.nextInt();
        System.out.println("Enter your Birth month(e.g 4):");
        month = input.nextInt();
        System.out.println("Enter your Birth year(e.g 2001):");
        year = input.nextInt();
        
        HeartRates yourHeartRates = new HeartRates(firstname,lastname,day,month,year);
        int MyAge = yourHeartRates.Age(2018);
        int MyMaxHeartRate=yourHeartRates.maxHeartRate(MyAge);
        double[] MyTargetHeartRate = yourHeartRates.targetHeartRate(MyMaxHeartRate);
        String mytargetheartrate = (Arrays.toString(MyTargetHeartRate));
        System.out.printf("Welcome to Ernest David Clinic.\n Hello there %s %s ,Here's your medical report.\n Age:%d \n Maximum Heart Rate:%d\nTarget Heart Rate Range:%s", firstname,lastname,MyAge,MyMaxHeartRate,mytargetheartrate );
             
        
    }
}
