import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int num : nums) {
            h1.put(num, h1.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(h1.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        int[] resultArray = new int[k];
        for (int i = 0; i < k; i++) {
            resultArray[i] =entryList.get(i).getKey();
        }
        return resultArray;
    }
}
