
package university_information;

import java.util.Scanner;

public class UserManagement {
    private Scanner sc;
    private String id;
    private String password;
    
    public void show(){
        sc = new Scanner(System.in);
        
        System.out.print("ID : ");
        id = sc.next();
        
        System.out.print("Password : ");
        password = sc.next();
        
        if(id.equals("registrar") && password.equals("registrar")){
            BachelorManagement bm = new BachelorManagement();
            bm.showBmFunc();
        } else if(id.equals("stu") && password.equals("stu")){
            LectureManagement lm = new LectureManagement();
            lm.showLmFunc(id, password);
        } else if(id.equals("pro") && password.equals("pro")){
            LectureManagement lm = new LectureManagement();
            lm.showLmFunc(id, password);
        } else if(id.equals("cm") && password.equals("cm")){
            ClassManagement cm = new ClassManagement();
            cm.showCmFunc();
        }
    }
}
