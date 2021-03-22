import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class student_registration
{
	public static void main(String[] args) 
	{	
	// String c,d,b;
	Integer key;
    Map<Integer,ArrayList<Object>>student  = new HashMap<>();
      
  	
	
	Scanner inp=new Scanner(System.in);
	
	while(true){
	 System.out.println("************** student registration *************");
	System.out.println("Press 1 for student management");
	System.out.println("Press 2 for teacher management");
	System.out.println("Press 3 for Attendence management");
	System.out.println("Press 4 for Fees management");
	System.out.println("Press 5 to know Student Information");
	System.out.println("Press 6 to know teacher Information");
	System.out.println("Press 0 to Exit");
	System.out.println("Enter Your Choice------->");
	
    
	int n=inp.nextInt();
	

	switch(n)
          { 
           
           case 1:
                  System.out.println("Press 1 to add student");
                  System.out.println("Press 2 to remove student");
                  System.out.println("Press 3 to update student");
                  
                  System.out.println("Press 0 to Exit");

                  
                  int a=inp.nextInt();
                  switch(a)
                  {
                  	case 1: System.out.println("Enter your code");
                  	       key=inp.nextInt();
                  	       System.out.println("Enter student First Name:");
                  	       String b=inp.next();
                  	       System.out.println("Enter student Last Name:");
                  	       String c=inp.next();
                  	      
                  	       System.out.println("Enter student Father Name:");
                  	       String d=inp.next();
                  	       System.out.println("Enter student Mother Name:");
                  	       String ii=inp.next();
                  	       System.out.println("Enter student Previous class:");
                  	       String jj=inp.next();
                  	       System.out.println("Enter student course to admit:");
                  	       String kk=inp.next();
                  	       System.out.println("Enter student phone number:");
                  	       String ll=inp.next();
                  	       System.out.println("Enter student Email id:");
                  	       String mm=inp.next();

                  	       ArrayList<Object> mylist = new ArrayList<>();
                  	       mylist.add(key);
                  	       mylist.add(b);
                  	       mylist.add(c);
                  	       mylist.add(d);
                  	       mylist.add(ii);
                  	       mylist.add(jj);
                  	       mylist.add(kk);
                  	       mylist.add(ll);
                  	       mylist.add(mm);
                           // System.out.println("************** your student data *************");
                  	       
                  	       
                  	       student.putIfAbsent(key,mylist);
                  	       // for(Object x : mylist)
                  	       // {
                  	       // 	System.out.println(x);
                  	       // }
                  	       // System.out.println(student);

                  	      

                       
                  	       break; 

                  	case 2:System.out.println("Enter student code :"); 
                  	       int e=inp.nextInt();
                  	       if(student.containsKey(e)) {
                  	       	    student.remove(e);
                  	        	System.out.println("student is deleted successfully");    
                  	       }
                  	       else{
                  	       	    System.out.println("this student data is not present in system");
                  	       }
                  	       
                  	       break;
                    case 3:System.out.println("Enter student code you wanna update:"); 
                  	       int ee=inp.nextInt();
                           System.out.println("Enter student First Name:");
                  	       String f=inp.next();
                  	       System.out.println("Enter student Last Name:");
                  	       String g=inp.next();
                  	       System.out.println("Enter student Father Name:");
                  	       String h=inp.next();
                  	       System.out.println("Enter student Mother Name:");
                  	       String i=inp.next();
                  	       System.out.println("Enter student Previous class:");
                  	       String j=inp.next();
                  	       System.out.println("Enter student course to admit:");
                  	       String k=inp.next();
                  	       System.out.println("Enter student phone number:");
                  	       String l=inp.next();
                  	       System.out.println("Enter student Email:");
                  	       String m=inp.next();
                  	       ArrayList<Object> mylist2 = new ArrayList<>();
                  	      
                  	       
                  	       mylist2.add(f);
                  	       mylist2.add(g);
                  	       mylist2.add(h);
                  	       mylist2.add(i);
                  	       mylist2.add(j);
                  	       mylist2.add(k);
                  	       mylist2.add(l);
                  	       mylist2.add(m);
                  	       student.put(ee,mylist2);

                          //  for(Object x : mylist2)
                  	       // {
                  	       // 	System.out.println(x);
                  	       // }               	       
                  	       

                  	       System.out.println("student is updated successfully");

                  	       break; 
                  	
                  	    
                   }
	                break;
                  
                    





           case 2:System.out.println("Press 1 to add Teacher");
                  System.out.println("Press 2 to remove Teacher");
                  System.out.println("Press 3 to update Teacher");
                  int o=inp.nextInt();
                   switch(o)
                  {
                  	case 1:System.out.println("Enter Teacher code:"); 
                  	       int uu=inp.nextInt();
                  	       System.out.println("Enter Teacher First Name:");
                  	       String p=inp.next();
                  	       System.out.println("Enter Teacher Last Name:");
                  	       String q=inp.next();
                  	       System.out.println("Enter Teacher Education:");
                  	       String r=inp.next();
                  	       System.out.println("Enter Teacher phone number:");
                  	       String s=inp.next();
                  	       System.out.println("Enter Teacher Email:");
                  	       String t=inp.next();
                  	       ArrayList<Object> mylist3= new ArrayList<>();
                  	        
                  	       mylist3.add(p);
                  	       mylist3.add(q);
                  	       mylist3.add(r);
                  	       mylist3.add(s);
                  	       mylist3.add(t);
                  	       student.put(uu,mylist3);
                  	       // for(Object x : mylist3)
                  	       // {
                  	       // 	System.out.println(x);
                  	       // }
                  	       
                  	       System.out.println("Teacher is Created successfully");
                  	       break;
                  	case 2:System.out.println("Enter Teacher code:"); 
                  	       int u=inp.nextInt();
                  	       student.remove(u);
                  	       System.out.println("Teacher is deleted successfully");
                  	       break;
                    case 3:System.out.println("Enter Teacher code you wanna update:");
                           int y1=inp.nextInt();
                           System.out.println("Enter Teacher First Name:");
                  	       String v=inp.next();
                  	       System.out.println("Enter Teacher Last Name:");
                  	       String w=inp.next();
                  	       System.out.println("Enter Teacher Education:");
                  	       String x=inp.next();
                  	       System.out.println("Enter Teacher phone number:");
                  	       String y=inp.next();
                  	       System.out.println("Enter Teacher Email:");
                  	       String z=inp.next();
                  	       
                  	       ArrayList<Object> mylist4= new ArrayList<>();
                  	        
                  	       mylist4.add(v);
                  	       mylist4.add(w);
                  	       mylist4.add(x);
                  	       mylist4.add(y);
                  	       mylist4.add(z);
                  	       student.put(y1,mylist4);
                  	       for(Object x1 : mylist4)
                  	       {
                  	       	System.out.println(x);
                  	       }
                  	       System.out.println("Teacher is updated successfully");
                  	       break;
                  	 } 

                  	 break;       
                  
                    
                   
           case 3:System.out.println("Enter student code:");
                  int xx =inp.nextInt();

                  System.out.println("Enter Attendence (P/A)--");
                  String zz=inp.next();
                  // adding last in array
                  student.get(xx).add(zz);	        
                 

                  break;
           case 4:System.out.println("Enter student code:"); 
                  int u2= inp.nextInt();
                  System.out.println("Enter Amount--");
                  int yy=inp.nextInt(); 
                  
                  student.get(u2).add(yy);
                  
                  System.out.println("Your Fees submitted successfully");   
                  break;
           case 5:System.out.println("*****Enter student code you wanna show******");
                  int student_code=inp.nextInt();
                  System.out.println("----------------------------------------------------------------------------------------------------------------------");
                  System.out.println(student.get(student_code)); 
                  System.out.println("-----------------------------------------------------------------------------------------------------------------------");    
                  break;  
           case 6:System.out.println("----------Enter Teacher code-------------");
                  int teacher_code=inp.nextInt();
                  System.out.println("---------------------------------------------------------------------------------------------------------------------"); 
                  System.out.println(student.get(teacher_code));   
                  System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
                  break;        
           case 0:
           return;
                   
           default:System.out.println("invalid choice");

           }
       }    
   }
} 
