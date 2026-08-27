class Solution {
    public int minMovesToMakePalindrome(String s) {
         char[] arr = s.toCharArray();
        int moves=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            //palindrome ki first and last value equal hoti hai vo check krenge 
            if(arr[left]==arr[right]){
                left++;
                right--;
                continue;
            }
            // equal nhi hai to right side mai check karnege till left+1 tak konsi equal hai 
            int index=right;
            while(index>left && arr[index]!=arr[left]){
                index--;
            }
            // while condition khatam hui matlab do conition mai se ke toot gyi 

            //1matlab mil gya elemnt jo left wale ke equal hai to swap karte chle jaynge right tak aur use count karenge 
            if(index>left){
                
                while(index<right){
                    char temp=arr[index];
                    arr[index]=arr[index+1];
                    arr[index+1]=temp;
                    index++;
                    moves++;
                }
                left++;
                right--;
            }else{//2 matlab koi element mila hi nhi to us element ki frequency 1 hai to jab hi possible palinfrome ban sakta h ab tak vo middle mai na aa jaye 
                char temp = arr[left];
                arr[left] = arr[left + 1];
                arr[left + 1] = temp;

                moves++;
            }
        }

        return moves;
    }
}