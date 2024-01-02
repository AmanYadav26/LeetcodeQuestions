import java.util.*;
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<Integer> a1=new ArrayList<>();
        List<List<Integer>> a2=new ArrayList<>();
        while(a1.size()<nums.length){
            List<Integer> a3=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(!a1.contains(i) && !a3.contains(nums[i])){
                   a3.add(nums[i]);
                   a1.add(i);
                } 
            }
            a2.add(a3);
        }
        return a2;
    }
}