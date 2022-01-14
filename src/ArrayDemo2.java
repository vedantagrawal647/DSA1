/*Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects.
 Now write a program to
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.  
(c) find  the number of students who have scored below 50 in their average.  
(d) display the scores obtained by every student.
 */
import java.util.Scanner;
class Demo2 {
    int arr[][];
    Demo2()
    {
        Scanner s=new Scanner(System.in);
        arr=new int[4][5];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
    }

    public void eachsubject()
    {
        for(int i=0;i<5;i++)
        {
            float c=0;
            for(int j=0;j<4;j++)
            {
                c=c+arr[j][i];
            }
            System.out.println("average marks obtained in subject " + (i+1) + " is " + (c/4));
        }
    }
    public void eachstudent()
    {
        for(int i=0;i<4;i++)
        {
            float c=0;
            for(int j=0;j<5;j++)
            {
                c=c+arr[i][j];
            }
            System.out.println("average marks obtained by student " +(i+1) + " is " + (c/5));
        }

    }
    public void noofstudent()
    {
        int d=0;
        for(int i=0;i<4;i++)
        {
            float c=0;
            for(int j=0;j<5;j++)
            {
                c=c+arr[i][j];
            }
            if((c/5)<50)
            {
                d=d+1;
            }

        }
        System.out.println("the number of students who have scored below 50 in their average " + d);
    }
    public void scorestudent()
    {

        for(int i=0;i<4;i++)
        {
            System.out.print("the scores obtained by student. "  + (i+1) + " is " );
            for(int j=0;j<5;j++)
            {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

public class ArrayDemo2 {
    public static void main(String[] args) {
        Demo2 obj=new Demo2();
        obj.eachsubject();
        System.out.println("--------------");
        obj.eachstudent();
        System.out.println("--------------");
        obj.noofstudent();
        System.out.println("--------------");
        obj.scorestudent();
    }
}
