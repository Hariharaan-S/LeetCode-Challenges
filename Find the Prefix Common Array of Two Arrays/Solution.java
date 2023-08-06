import java.util.HashSet;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int []ans = new int[A.length];
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        for(int i=0;i<A.length;i++){
            a.add(A[i]);
            b.add(B[i]);
            HashSet<Integer>temp = new HashSet<>(a);
            temp.retainAll(b);
            ans[i] = temp.size();
        }
        return ans;
    }
}