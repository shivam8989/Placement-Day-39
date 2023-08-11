package Prolems;
import java.util.*;
public class Checkseqence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        boolean isSequence = true;
        for(int i =0; i < n -2; i++)
        {
            if(arr[i] == arr[i+1] || arr[i +1] == arr[i +2])
            {
                isSequence = false;
                break;
            }
            if(arr[i] < arr[i + 1] && arr[i+1] > arr[i + 2])
            {
                isSequence = false;
                break;
            }
        }
        System.out.print(isSequence);

    }
}

