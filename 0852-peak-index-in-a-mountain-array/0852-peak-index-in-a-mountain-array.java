class Solution { 
    public int peakIndexInMountainArray(int[] nums) {
     int n=nums.length;
      int lo=1,hi=n-2;
      while(lo<=hi){
         int mid=(lo+hi)/2; 
      if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1] )return mid; 
      else if(nums[mid]>nums[mid-1]&& nums[mid]<nums[mid+1])lo=mid+1; 
      else hi=mid-1;
       } 
      return 368785;
       }
        }