import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> p = new ArrayList<>();
        for(int i=0;i<m;i++){
            p.add(i+1);
        }
        int []r = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            r[i] = p.indexOf(queries[i]);
            p.remove(p.indexOf(queries[i]));
            p.add(0,queries[i]);
        }
        return r;
    }
}