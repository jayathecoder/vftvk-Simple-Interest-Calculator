class Solution {
    
  
    public String reverseWords(String s) {
        int i = 0, j = 0;
        char[] arr = s.toCharArray();
        while(j < s.length()) {
            if (s.charAt(j) == ' ' || j == s.length() - 1) {
                int start = i, end = s.charAt(j) == ' ' ? j - 1 : j;
                while (start <= end) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                i = j + 1;
                j = i;
                continue;
            }
            j++;
        }
        return String.valueOf(arr);
    }
}