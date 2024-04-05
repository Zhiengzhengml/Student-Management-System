import java.util.*;
public class Student {
    //When it comes to adding new entries,enums are not really useful or necessary.
    enum Students{
        Student1("001", "Henry", 'M', "123 Pine Street", "Active"),
        Student2("002", "Martha", 'F', "Pine Street", "Graduated"),
        Student3("003", "Rachel", 'F', "Pine Avenue", "Active"),
        Student4("004", "John", 'M', "Hogwart", "Suspended");
        private String id;
        private String name;
        private char gender;
        private String address;
        private String status;  
        private Students(String id, String name, char gender, String address, String status){
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.address = address;
            this.status = status;
        }
        public String getID(){
            return id;
        }
        public String getName(){
            return name;
        }
        public char getGender(){
            return gender;
        }
        public String getAddress(){
            return address;
        }
        public String getStatus(){
            return status;
        }
    }

    private String teacherID;
    private String teacherName;
    
    public Student(String teacherID, String teacherName){
        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }
    public String getTeacherID(){
        return teacherID;
    }
    public String getTeacherName(){
        return teacherName;
    }

    public void searchByID(String id){
        for(Students student:Students.values()){
            if(student.getID().equals(id)){ //到时equals括号里的id就是Main里面输入的studentID,就是对应的实参，然后这个实参去和getID的值比较是否相等
                System.out.println("id:"+student.getID());//此时student.getID()将返回当前遍历到的学生对象的ID属性
                System.out.println("name:"+student.getName());
                System.out.println("gender"+student.getGender());
                System.out.println("address:"+student.getAddress());
                System.out.println("Status:" + student.getStatus() + "\n");
                break;
            }else{
                System.out.println("Sorry,no such id found"+"\n");
                break;
            }
        }
    }
    public void searchByName(String name){
        for(Students student : Students.values()){
            if(student.getName().equals(name)){
                System.out.println("The student was found:" + "\n");
                System.out.println("ID:" + student.getID() + "\n");
                System.out.println("Gender:" + student.getGender() + "\n");
                System.out.println("Address:" + student.getAddress() + "\n");
                System.out.println("Status:" + student.getStatus() + "\n");
                break;
            }else{
                System.out.println("Sorry, no such name found" + "\n");
            }
        }
    }

    public String toString(){
        return " Your ID is: " + getTeacherID() + "\n" + " and your name is " + getTeacherName() + "\n";
    }

    Scanner reader=new Scanner(System.in);
    //Adding following variable to adapt to the array requirement
    //将每个学生的ID放到一个数组，将每个学生的name放到一个数组,将每个学生的gender放到一个数组...
    private String[] studentID;
    private String[] studentName;
    private char[] gender;
    private String[] address;
    private String[] status;
    public void setStudentID(int i, String id){
        studentID[i] = id;
    }

    public void setStudentName(int i, String name){
        studentName[i]=name;
    }

    public void setGender(int i, char gender){
        this.gender[i] = gender;
    }  

    public void setAddress(int i, String address){
        this.address[i] = address;
    }

    public void setStatus(int i, String status){
        this.status[i] = status;
    }

    public String getStudentID(int i){
        return studentID[i];
    }

    public String getStudentName(int i){
        return studentName[i];
    }

    public char getGender(int i){
        return gender[i];
    }

    public String getAddress(int i){
        return address[i];
    }

    public String getStatus(int i){
        return status[i];
    }

    public Student(int size){
        this.studentID = new String[size];
        this.studentName = new String[size];
        this.gender = new char[size];
        this.address = new String[size];
        this.status = new String[size];
    }

    public void addStudents(int size){
        for(int i=0;i<size;i++){
            System.out.println("Enter the student"+(i+1)+" ID:");
            studentID[i]=reader.nextLine();
            /*或者是 String id = reader.nextLine();
             setStudentID(i,id); 
             */
            System.out.println("Enter the student"+(i+1)+" name:");
            studentName[i]=reader.nextLine();
            System.out.println("Enter the new student gender:" );
            gender[i] = reader.nextLine().charAt(0);
            System.out.println("Enter the new student address:" );
            address[i] = reader.nextLine();
            System.out.println("Enter the new student status:");
            status[i] = reader.nextLine();
        }//添加完这个对象的信息
    }



    public void diaplayRecentAddtions(int size){
        for(int i=0;i<size;i++){
            System.out.println("Following are the details of Student #" + (i+1) + "\n");
            System.out.println("ID:" + getStudentID(i) + "\n");
            System.out.println("Name:" + getStudentName(i) + "\n");
            System.out.println("Gender:" + getGender(i) + "\n");
            System.out.println("Address:" + getAddress(i) + "\n");
            System.out.println("Status:" + getStatus(i) + "\n" + "\n");
        }
    }












}
