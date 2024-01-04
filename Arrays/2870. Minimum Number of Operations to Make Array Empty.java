import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            h1.put(nums[i], h1.getOrDefault(nums[i], 0) + 1);
        }
        
     
        
        int count = 0;
        

        while (!allValuesZero(h1)) {
            for (Map.Entry<Integer, Integer> entry : h1.entrySet()) {
                int value = entry.getValue();
                
                if (value == 1) {
                    return -1;
                }
                
                if (value == 0) {
                    continue;
                }
                if(value%3==0){
                    count++;
                    entry.setValue(value-3);
                }
                
                else if (value % 2 == 0) {
                    count++;
                    entry.setValue(value - 2);
                } else {
                    count++;
                    entry.setValue(value - 3);
                }
            }
        }
        
        return count;
    }
    
    public boolean allValuesZero(HashMap<Integer, Integer> map) {
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
