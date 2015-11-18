
package university_information;

import java.util.Scanner;

public class BachelorManagement {
    private Scanner sc;
    private int sel;
    
    BachelorManagement(){
        sc = new Scanner(System.in);
    }
    
    private void registerStu(){
        System.out.println("You chose to register a new student");
    }
    private void searchStu(){
        System.out.println("You chose to search a student information");
    }
    private void editStu(){
        System.out.println("You chose to edit a student information");
    }
    private void deleteStu(){
        System.out.println("You chose to delete a student information");
    }
    
    public void showBmFunc(){        
        System.out.println("1. Register a new student");
        System.out.println("2. Search a student information");
        System.out.println("3. Edit a student information");
        System.out.println("4. Delete a student information");
        System.out.print("Select : ");
        
        sel = sc.nextInt();
        
        switch(sel){
            case 1:
                registerStu();
                break;
            case 2:
                searchStu();
                break;
            case 3:
                editStu();
                break;
            case 4:
                deleteStu();
                break;
            default:
                break;
        }
    }
}
