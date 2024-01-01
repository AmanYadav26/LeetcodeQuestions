class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> a1=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            a1.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(nums[i]>a1.peek()){
                a1.poll();
                a1.add(nums[i]);
            }
        }
        return a1.peek();

    }
}
