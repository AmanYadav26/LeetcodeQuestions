class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     
           List<List<Integer>> a1 = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
            int target=-(nums[i]);
            int l=i+1;
            int h=nums.length-1;
            while(l<h){
                if(nums[l]+nums[h]==target){
                  a1.add(Arrays.asList(nums[i],nums[l],nums[h]));

                  while(l<h && nums[l]==nums[l+1]){
                      l++;
                  }
                  while(l<h && nums[h]==nums[h-1]){
                      h--;
                  }
                  l++;
                  h--;
                }   
                else if(nums[l]+nums[h]>target) h--;
                else if(nums[l]+nums[h]<target) l++;

            }

        }
        }
        return a1;
       
    }
}