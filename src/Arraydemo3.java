/* Q. Write a program to remove consecutive duplicate elements in an array.
  Input values  10 10 30 30 40 50 50 50 9 45
  Output        10 30 40 50 9 45*/


public class Arraydemo3{
    public static void main(String[] args) {
        int arr[]={10,10,30,30,40,50,50,50,9,45};
        System.out.print(arr[0] + " ");
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
