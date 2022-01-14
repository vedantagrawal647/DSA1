/* write a program to create array of size 5 and assign Minimum integer value in array
(a)print array
(b) */
import java.lang.reflect.Array;
import java.util.Scanner;
public class ArrayDemo1 {
    int arr[]=null;

    // constructor to intialize an array
    public ArrayDemo1()
    {
        arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }

    // to insert or modify value at given index in an array
    public void insert(int value,int index)
    {
        try
        {
            if(arr[index]==Integer.MIN_VALUE)
            {
                arr[index]=value;
            }
            else
            {
                System.out.println("already filled");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index");
        }

    }

    //method to traverse an array
    //to print all the value stored in array
    public void traverse()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    //method to print specific index value
    public void indexvalueprint(int index)
    {
        try
        {
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("invalid index");
        }
    }

    //method to search a value in the given array
    public void searchinarray(int searchvalue)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==searchvalue)
            {
                c=1;
                System.out.println("value found");
                return;
            }

        }
        if(c!=1)
        {
            System.out.println("no match found");
        }
    }

    //method to delete a value from array
    //user provide the index
    public void deletevalue(int index)
    {
        try
        {
            arr[index]=Integer.MIN_VALUE;//delete array
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of range");
        }
    }

    //delete complete array
    public void deletearray()
    {
        arr=null;
    }

    public static void main(String[] args) {
        ArrayDemo1 obj=new ArrayDemo1();
        obj.traverse();
        System.out.println("-----------------------");
        obj.insert(35,1);
        obj.traverse();
        System.out.println("-----------------------");
        obj.indexvalueprint(1);
        System.out.println("-----------------------");
        obj.searchinarray(35);
        System.out.println("-----------------------");
        obj.searchinarray(25);
        System.out.println("-----------------------");
        obj.deletevalue(1);
        obj.traverse();
        System.out.println("-----------------------");
        obj.deletearray();

    }
}
