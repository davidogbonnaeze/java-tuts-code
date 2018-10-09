import java.util.Arrays;
public class HeartRates {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year ;
   // private int age;
   // private int maxheartrate;
    //private int targetheartrate;
    
    public HeartRates(String fName,String lName,int dy,int mth,int yr){
        firstName = fName;
        lastName = lName;
        day = dy;
        month = mth;
        year = yr;
    }
    
    public void setFirstName(String fName){
        firstName = fName;
    }
    public void setLastName(String lName){
        lastName = lName;
    }
      public void setDay(int dy) {
        day = dy;
    }
    public void setMonth(int mth){
        month = mth ;
    }
    public void setYear(int yr){
        year = yr;
    }
    
    public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastName;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public int Age( int thisYear){
        int age = thisYear - year;
         return age;
    }
    public int maxHeartRate(int age){
      int  maxheartrate = 220 - age;
        return maxheartrate;    
    }
    public static  double[] targetHeartRate(int maxheartrate){
        double lowertargetheartrate = (maxheartrate * 0.5);
        double uppertargetheartrate = (maxheartrate * 0.85);
        return new double[]{lowertargetheartrate,uppertargetheartrate};        
    }
  
}













