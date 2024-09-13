class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int[] myNums = new int[nums.length];
        boolean zeroExists = false;
        boolean multiZero = false;

        for(int num : nums){
            if(num == 0 && !zeroExists) zeroExists = true;
            else if(num == 0 && zeroExists){
                multiZero = true;
            }
            else totalProduct *= num;
        }
        System.out.println("total product: "+totalProduct+"\n");

        for(int i = 0; i < nums.length; i++){
            if(zeroExists && nums[i] != 0){
                myNums[i] = 0;
            }
            else if(multiZero){
                myNums[i] = 0;
            }

            else if(zeroExists){ 
            myNums[i] = totalProduct;
            }
            
            else{
                myNums[i] = totalProduct / nums[i];
            }
            System.out.println(myNums[i]);

        }
        
        return myNums;
    }
}