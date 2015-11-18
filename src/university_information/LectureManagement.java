
package university_information;

import java.util.Scanner;

public class LectureManagement {
    private Scanner sc;
    private int sel;
    
    LectureManagement(){
        sc = new Scanner(System.in);
    }
    
    private void applyLecture(){
        System.out.println("Apply a new lecture as a student");
    }
    private void checkScore(){
        System.out.println("Check score as a student");
    }
    private void checkStuList(){
        System.out.println("Check a student list as a professor");
    }
    private void checkRoaster(){
        System.out.println("Check a roaster as a professor");
    }
    private void typeScore(){
        System.out.println("Type a score as a professor");
    }
    
    
    private void showForStu(){        
        System.out.println("1. Apply a new lecture");
        System.out.println("2. Check my score");
        System.out.print("Select : ");
        
        sel = sc.nextInt();
        
        switch(sel){
            case 1:
                applyLecture();
                break;
            case 2:
                checkScore();
                break;
            default:
                break;
        }
    }
    
    private void showForPro(){      
        System.out.println("1. Check student list");
        System.out.println("2. Check a roaster");
        System.out.println("3. Type a score");
        System.out.print("Select : ");
        
        sel = sc.nextInt();
        
        switch(sel){
            case 1:
                checkStuList();
                break;
            case 2:
                checkRoaster();
                break;
            case 3:
                typeScore();
                break;
            default:
                break;
        }
    }
    
    public void showLmFunc(String id, String password){
        if(id.equals("stu") && password.equals("stu")){
            showForStu();
        } else if(id.equals("pro") && password.equals("pro")){
            showForPro();
        }
    }
}
