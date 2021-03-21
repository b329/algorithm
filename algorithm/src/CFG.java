import javafx.util.Pair;
import java.util.ArrayList;
import java.util.*;

class GfG
{
    // Function returns the minimum number of swaps 
    // required to sort the array 
    public static int distinct(int[] A)
    {
        int n = A.length;

        ArrayList <Pair <Integer, Integer> > arrpos =
                new ArrayList <Pair <Integer, Integer> > ();
        for (int i = 0; i < n; i++)
            arrpos.add(new Pair <Integer, Integer> (A[i], i));
        arrpos.sort(new Comparator<Pair<Integer, Integer>>()
        {
            @Override
            public int compare(Pair<Integer, Integer> o1,
                               Pair<Integer, Integer> o2)
            {
                if (o1.getKey() > o2.getKey())
                    return -1;
                else if (o1.getKey().equals(o2.getKey()))
                    return 0;

                else
                    return 1;
            }
        });

        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);
        int answer = 0;

        for (int i = 0; i < n; i++)
        {
            if (vis[i] || arrpos.get(i).getValue() == i)
                continue;
            int cSize = 0;
            int j = i;
            while (!vis[j])
            {
                vis[j] = true;

                j = arrpos.get(j).getValue();
                cSize++;
            }

            if(cSize > 0)
            {
                answer += (cSize - 1);
            }
        }
        return answer;
    }
}

// Driver class 
class MinSwaps
{
    // Driver program to test the above function 
    public static void main(String[] args)
    {
        int []a = {1, 5, 4, 3, 2};
        GfG g = new GfG();
        System.out.println(g.distinct(a));
    }
} 