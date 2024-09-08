import java.util.Scanner;

class student{
    public int rollNo;
    public String name;
    public String course;

    public void total(int m1,int m2,int m3){
        int sum = m1+m2+m3;
        System.out.printf("Total marks are %d \n",sum);
    }

    public void average(int m1,int m2,int m3){
        double averageMarks = (m1+m2+m3)/3;
        System.out.printf("Average marks are %f \n", averageMarks);
    }

    public void grade(int m1,int m2,int m3){
        double percentage = ((m1+m2+m3)/3);
        System.out.printf("Grade secure are: %f\n",percentage);
    }

    public void marks(int m1,int m2,int m3){
        System.out.printf("Student details \n%d %s \n%s", rollNo,name,course);
        total(m1,m2,m3);
        average(m1,m2,m3);
        grade(m1,m2,m3);
    }
}

public class studentClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks of DBMS, OS and OOPS: ");

        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();

        student st = new student();
        st.rollNo= 4126;
        st.name = "Abhiraj";
        st.course="Computer Engineering";
        st.marks(m1,m2,m3);

    }
}
