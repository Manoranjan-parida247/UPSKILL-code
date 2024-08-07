// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner; 
import java.util.*;
class D2b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        sc.close();
        ArrayList<Integer> list = new ArrayList<>();
        while(num != 0)
        {
            int digit = num % 2;
            list.add(digit);
            num /= 2;
        }
        Collections.reverse(list);
        System.out.println("Binary number is" + list);

        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == 0)
            {
                count0++;
            }else{
                count1++;
            }
        }
        System.out.println("Number of zero present in binary :" + count0);
        System.out.println("Number of one present in binary :" + count1);
    }
}
