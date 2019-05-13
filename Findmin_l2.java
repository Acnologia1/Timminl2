package Lession2;
import java.util.Scanner;

public class Findmin_l2 {
    public static void main(String[] args)
    {
        int array[] = {9,4,5,1,3,2,6,4,6};
        int index = minValue(array);
        System.out.println("Giá trị nhỏ nhất của dãy: "+ array[index]);
    }
    //thuật toán tìm min
    public static int minValue(int []array)
    {
        int min = array[0];
        int index = 0;

        for(int i = 1;i<array.length;i++)
        {
            if(array[i]< min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
