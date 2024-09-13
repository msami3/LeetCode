class Solution {
    public String addBinary(String a, String b) {
        if(a.length()>b.length()){
            while(a.length()!=b.length()){
                b = "0".concat(b);
            }
        }
        else if(b.length()>a.length()){
            while(a.length()!=b.length()){
                a = "0".concat(a);
            }
        }
        
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        
        String ans = "";
        char carry = '0';
        
        int index = aArr.length-1;
        
        while(index>=0){
            if(aArr[index]!=bArr[index]&&carry=='0'){
                ans = "1".concat(ans);
            }
            else if(aArr[index]!=bArr[index]&&carry=='1'){
                ans = "0".concat(ans);
                carry = '1';
            }
            else if(aArr[index]=='0'&&bArr[index]=='0'&&carry=='0'){
                ans = "0".concat(ans);
            }
            else if(aArr[index]=='0'&&bArr[index]=='0'&&carry=='1'){
                ans = "1".concat(ans);
                carry = '0';
            }
            else if(aArr[index]=='1'&&bArr[index]=='1'&&carry=='0'){
                ans = "0".concat(ans);
                carry = '1';
            }
            else{
                ans = "1".concat(ans);
                carry = '1';
            }
            
            index--;
        }
        if(carry=='1'){
            ans = "1".concat(ans);
        }
        
        return ans;
    }
}