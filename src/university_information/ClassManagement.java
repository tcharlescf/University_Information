
package university_information;

import java.util.Scanner;

public class ClassManagement {
    private Scanner sc;
    private int sel;
    
    ClassManagement(){
        sc = new Scanner(System.in);
    }
    
    private void issueBill(){
        System.out.println("Issue a bill to each student");
    }
    private void registerLecture(){
        System.out.println("Register a new lecture for this semester");
    }
    private void deleteLecture(){
        System.out.println("Delete a lecture that was made for this semester");
    }
    private void editLecture(){
        System.out.println("Edit a lecture taht was made for this semester");
    }
    
    public void showCmFunc(){
        System.out.println("1. Issue a bill");
        System.out.println("2. Register a new lecture");
        System.out.println("3. Delete a lecture");
        System.out.println("4. Edit a lecture information");
        System.out.print("Select : ");
        
        sel = sc.nextInt();
        
        switch(sel){
            case 1:
                issueBill();
                break;
            case 2:
                registerLecture();
                break;
            case 3:
                deleteLecture();
                break;
            case 4:
                editLecture();
                break;
            default:
                break;
        }
    }
}
