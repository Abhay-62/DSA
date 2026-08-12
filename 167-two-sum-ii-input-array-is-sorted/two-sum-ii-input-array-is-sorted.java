class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] {};
    }
    //isme two pinter aproach use kia h jisme ek pointer starting se aur ek pointer end se phir un dono ka sum check karke pointer move karenge  
}