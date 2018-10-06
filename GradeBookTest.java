import java.util.Scanner;
public class GradeBookTest{
   public static void main(String[] args){
       
       Scanner input = new Scanner(System.in);
        Gradebook Gradebook1 = new Gradebook("PHS 412 QUANTUM MECHANICS 2","DR AKINLAMI");
        Gradebook Gradebook2 = new Gradebook("PHS 472 METHODS OF MATHEMATICAL PHYSICS 2","PROF MAKINDE");
        //String nameOfCourse;
       //System.out.println("Enter the name of the course:");
        //nameOfCourse = input.nextLine();
       
       Gradebook1.displayMessage( );
       Gradebook2.displayMessage( );
       
   } 
}
