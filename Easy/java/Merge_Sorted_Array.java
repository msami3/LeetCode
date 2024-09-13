class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            
        }
        else{
        int ind1 = 0;
        int ind2 = 0;
        int ans[] = new int[m+n];
        for(int i=0; i<m+n; i++){
            if(ind2>n-1){
                ans[i]=nums1[ind1];
                ind1++;
            }
            else if(ind1>m-1){
                ans[i]=nums2[ind2];
                ind2++;
            }
            else if(nums1[ind1]<nums2[ind2]){
                ans[i] = nums1[ind1];
                ind1++;
            }
            else if(nums1[ind1]==nums2[ind2]){
                ans[i]=nums1[ind1];
                i++;
                ans[i]=nums2[ind2];
                ind1++;
                ind2++;
            }
            else{
                ans[i] = nums2[ind2];
                ind2++;
            }
        }
        
        for(int i = 0; i<nums1.length; i++){
            nums1[i]=ans[i];
        }
        }
    }
}