import java.util.*;
class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> a1=new ArrayList<>();
        for(String s1 : bank){
            int count=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='1') count++;
            }
            if(count!=0) a1.add(count);
        }
        if(a1.size()<=1) return 0;
        int sum=0;
        for(int i=0;i<a1.size()-1;i++){
            int value=a1.get(i)*a1.get(i+1);
            sum+=value;
        } 
        return sum;
    }
}