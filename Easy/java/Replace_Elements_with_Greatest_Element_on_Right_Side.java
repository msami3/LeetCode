class Solution {
    public int[] replaceElements(int[] arr) {
        int[] elem = new int[arr.length];
        int high = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(i == len -1){
                elem[i] = -1;
            }
            for(int j = i+1; j<len; j++){
                if(arr[j]>high){
                    high = arr[j];
                    elem[i] = high;
                }
            }
            high = 0;
        }
        return elem;
    }
}