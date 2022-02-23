class Solution {
    public void rotate(int[] nums, int k) {
       int l = nums.length;
    int result[] = new int[l];
    int j = l-k%l , i=0;
    while(i<l){
        result[i] = nums[j%l];
        i++;
        j++;
    }
    for(int t =0; t<l; t++){
        nums[t] = result[t];
    }  
    }
}