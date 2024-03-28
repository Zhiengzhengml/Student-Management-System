import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your id");
        String teacherId = reader.nextLine();
        System.out.println("Enter your name:");
        String teacherName = reader.nextLine();
        int choice;
        do{
            System.out.println("Type 1 to search by ID");
            System.out.println("Type 2 to search by name");
            System.out.println("Type 3 to exit.");
            System.out.println("Enter the choice");
            choice = reader.nextInt();
            reader.nextLine(); 
            Student student = new Student(teacherId,teacherName);//为什么要创建一个学生对象
            System.out.println(student); //Studnet里toString就是重写的这个，toString里return写的是什么，这里就输出什么
            switch(choice){
                case 1:
                System.out.println("Enter the ID what you want to search:");
                String studentID =reader.nextLine();
                student.searchByID(studentID);
                break;
                case 2:
                System.out.println("Enter the name what you want to search:");
                String studentName =reader.nextLine();
                student.searchByName(studentName);
                break;
                case 3:
                break;
                default:
                System.out.println("Invalid choice");
            }
        }while(choice !=3);//  =3就退出循环
        reader.close();
    }
}
