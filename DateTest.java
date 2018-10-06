import java.util.Scanner;
public class DateTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       int day;
       int month;
       int year;
       
       System.out.println("Enter the day");
       day = input.nextInt();
       System.out.println("Enter the month");
       month = input.nextInt();
       System.out.println("Enter the year");
       year = input.nextInt();
       
       Date todaysDate = new Date(day,month,year);
       
       todaysDate.displayDate();
       
       
    }
}