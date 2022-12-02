import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    /*
    Sum consecutives.
    You are given a list/array which contains only integers (positive and negative).
    Your job is to sum only the numbers that are the same and consecutive. The result should be one list.

Extra credit if you solve it in one line. You can assume there is never an empty list/array and there will
always be an integer.
#Examples:
[1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]

"""So as you can see sum of consecutives 1 is 1
sum of 3 consecutives 4 is 12
sum of 0... and sum of 2
consecutives 3 is 6 ..."""


[1,1,7,7,3] # should return [2,14,3]
[-5,-5,7,7,12,0] # should return [-10,14,12,0]
     */
    public class Consecutives {
        public static List<Integer> sumConsecutives(List<Integer> s) {
            // your code
            int [] a = new int[s.size()];
            int p = 0;
            a[0] = s.get(0);
            for (int i = 1; i < s.size(); i++)
            {
                if (s.get(i) != s.get(i-1))
                {
                    p++;
                    a[p] = s.get(i);
                }
                else
                {
                    a[p] += s.get(i);
                }
            }

            ArrayList<Integer> b = new ArrayList<Integer>(p+1);
            for (int i = 0; i < p+1; i++)
            {
                b.add(a[i]);
            }
            return b;
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}