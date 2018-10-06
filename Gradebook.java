public class Gradebook{
    private String coursename;
    private String instructorname;
    public Gradebook(String cname,String iname) {
       coursename = cname;
       instructorname = iname;
    }
     public void setCourseName(String cname) {
         coursename = cname;
     }
     public void setInstructorName(String iname) {
         instructorname = iname ;
     }
     public String getCourseName() {
         return coursename;
     }
       public String getInstructorName() {
         return instructorname;
     }
     public void displayMessage(){
        System.out.printf("Welcome to the Gradebook for %s.\n This course is presented by %s. \n\n " ,getCourseName(),getInstructorName());
    }
}
