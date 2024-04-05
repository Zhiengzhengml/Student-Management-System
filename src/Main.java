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
            System.out.println("Type 3 to add new student by mane");
            System.out.println("Type 4 to exit.");
            System.out.println("Enter the choice");
            choice = reader.nextInt();
            reader.nextLine(); 
            Student student = new Student(teacherId,teacherName);//只是单纯创建一个Student类的对象，但实际意义是存储这个老师的信息
            System.out.println(student); //(student)其实是隐藏了(student.toString()),其实这里是在调用toString()方法，Studnet类里toString就是在重写的这个，toString里return写的是什么，这里就输出什么
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
                System.out.println("Enter the total number of student what you want to add:");
                int number = reader.nextInt();
                reader.nextLine();
                Student studentToAdd = new Student(number); //新创建的对象（新的学生）
                studentToAdd.addStudents(number); //
                studentToAdd.diaplayRecentAddtions(number);
                break;
                case 4:
                break;
                default:
                System.out.println("Invalid choice");
            }
        }while(choice !=4);//  =4就退出循环
        reader.close();
    }
}
