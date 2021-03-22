import java.util.*;

class Attendance{

    int dateNumber;

    ArrayList<EmployeeWrapper> allEmployeesAttendance = new ArrayList<EmployeeWrapper>();

    public static Attendance addAttendance(int dateNumber, ArrayList<Employee> allEmployees){

        Attendance attendanceObject = new Attendance();

        attendanceObject.dateNumber = dateNumber;

        for(int i = 0; i < allEmployees.size(); i++){

                        System.out.println(allEmployees.get(i).firstName+ " : ");

                       

            Scanner sObject = new Scanner(System.in);

            char attend = sObject.next().charAt(0);

            EmployeeWrapper object = new EmployeeWrapper();

            object.employeeObject = allEmployees.get(i);

            object.isPersent = (attend == 'P') ? true : false;

            attendanceObject.allEmployeesAttendance.add(object);

        }

        return attendanceObject;

    }

}

class EmployeeWrapper{

    Employee employeeObject;

    boolean isPersent;

}

class Employee{

    int empCode;

    String firstName;

    String lastName;

    String email;

    long phone;

    String designation;

    long salary;

    public static Employee addEmployee(int empCode){

        Employee empObject = new Employee();

        empObject.empCode = empCode;

        Scanner sObject = new Scanner(System.in);

        System.out.println("FirstName : ");

        empObject.firstName = sObject.nextLine();

        System.out.println("Lastname : ");

        empObject.lastName = sObject.nextLine();

        System.out.println("Salary : ");

        empObject.salary = sObject.nextInt();

        return empObject;

    }

}

public class EmployeeManagement {

    public static void main(String[] args){

        int firstInput = 0;

        int secondInput = 0;

        int empCodeStarting = 101;

        ArrayList<Employee> allEmployees = new ArrayList<Employee>();

        ArrayList<Attendance> allAttendances = new ArrayList<Attendance>();

        do{

            System.out.println("Press 1 for Manage Employee");

            System.out.println("Press 2 for  Attendance Management ");

            System.out.println("Press 0 to Exit");

           

            Scanner sObject = new Scanner(System.in);

            firstInput = sObject.nextInt();

           

            if(firstInput == 1){

                //Employee Management

                System.out.println("Press 1 to add employee ");

                System.out.println("Press 2 to remove employee");

                System.out.println("Press 3 to update employe ");

                System.out.println("Press 4 to view all employee");

                secondInput = sObject.nextInt();

                if(secondInput == 1){

                    allEmployees.add(Employee.addEmployee(empCodeStarting));

                    empCodeStarting++;

                }else if(secondInput == 2){

                    System.out.println("Enter employee code");

                    int empCodeToDelete = 0;

                    empCodeToDelete = sObject.nextInt();

                    for(int i = 0; i < allEmployees.size(); i++){

                        if(allEmployees.get(i).empCode == empCodeToDelete){

                            allEmployees.remove(i);

                        }

                    }

                   

                }else if(secondInput == 3){

                    System.out.println("Enter employee code");

                    int empCodeToUpdate = 0;

                    empCodeToUpdate = sObject.nextInt();

                    for(int i = 0; i < allEmployees.size(); i++){

                        if(allEmployees.get(i).empCode == empCodeToUpdate){

                            allEmployees.remove(i);

                        }

                    }

                    allEmployees.add(Employee.addEmployee(empCodeToUpdate));

                   

                }else if(secondInput == 4){

                    System.out.println("Code \tEmployee name \t Salary");

                    for(int i = 0; i < allEmployees.size(); i++){

                        System.out.println(allEmployees.get(i).empCode+" \t"+allEmployees.get(i).firstName +" "+allEmployees.get(i).lastName+" \t "+allEmployees.get(i).salary);

                    }

                }

            }else if(firstInput == 2){

                //Attendance Management

                System.out.println("Press 1 to add Attendance");

                System.out.println("Press 2 to view all Attendances");

                secondInput = sObject.nextInt();

                if(secondInput == 1){

                    System.out.println("Enter date");

                    int dateO = sObject.nextInt();

                    Attendance attObject = Attendance.addAttendance(dateO, allEmployees);

                    allAttendances.add(attObject);

                }else if(secondInput == 2){

                   

                   

                    for(int j = 0; j < allAttendances.size(); j++){

                    System.out.println("Date "+allAttendances.get(j).dateNumber);

                        System.out.println("Code \tEmployee name \t Attandance");

                    for(int i = 0; i < allAttendances.get(j).allEmployeesAttendance.size(); i++){

                       

                        char attend = (allAttendances.get(j).allEmployeesAttendance.get(i).isPersent == true) ? 'P' : 'A';

                        System.out.println(allAttendances.get(j).allEmployeesAttendance.get(i).employeeObject.empCode+" \t"+allAttendances.get(j).allEmployeesAttendance.get(i).employeeObject.firstName+"\t "+ attend);

                    }

                }

                }

            }

        }while(firstInput != 0);

    }

}