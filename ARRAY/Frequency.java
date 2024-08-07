// find the majority element in array
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter element into the array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int maxFrequency = 0;
        int maxFrequencyElement = arr[0];

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == Integer.MIN_VALUE)
            {
                continue;
            }
            int count = 1;
            for(int j = i+1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    arr[j] = Integer.MIN_VALUE;
                }
            }

            if(count > maxFrequency)
            {
                maxFrequency = count;
                maxFrequencyElement = arr[i];
            }
        }
        System.out.println("The majority element in the array is :" + maxFrequencyElement + " with frequency :" + maxFrequency);
        sc.close();
    }
}

//import java.util.Arrays;

// public class FrequencyCounter {
//     public static void countFrequencies(int[] arr) {
//         int n = arr.length;

//         // Step 1: Decrease each element by 1 to use it as an index
//         for (int i = 0; i < n; i++) {
//             arr[i] = arr[i] - 1;
//         }

//         // Step 2: Use the elements as indices to store the frequency count
//         for (int i = 0; i < n; i++) {
//             arr[arr[i] % n] = arr[arr[i] % n] + n;
//         }

//         // Step 3: Extract frequencies from the modified array
//         System.out.println("Element | Frequency");
//         for (int i = 0; i < n; i++) {
//             int frequency = arr[i] / n;
//             if (frequency > 0) {
//                 System.out.println((i + 1) + "\t| " + frequency);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 5, 3, 3, 2, 1, 5};
//         countFrequencies(arr);
//     }
// }
