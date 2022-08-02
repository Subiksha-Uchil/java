public class EmployeeDetails {
    final int id;
    EmployeeDetails(int idNum) {
   id=idNum;
}
void getDetails(){
    System.out.println("ID of Employee is: " + id);
}
public static void main(String[] args){
    EmployeeDetails emp = new EmployeeDetails(145);
    emp.getDetails();
}
}