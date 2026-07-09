// Last updated: 7/9/2026, 9:47:26 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> temp = new ArrayList<>();
        int left = 0,right= 0;

        while(left < m && right < n){


            if(nums1[left] <= nums2[right]){
                temp.add(nums1[left]);
                left++;
            }else{
                temp.add(nums2[right]);
                right++;
            }
        }
        while(left < m){
            temp.add(nums1[left]);
            left++;
        }
        while(right < n){
            temp.add(nums2[right]);
            right++;
        }

        for(int k=0; k < temp.size();k++){
            nums1[k] = temp.get(k);
        }

    }
}