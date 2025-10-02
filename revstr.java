class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.trim().split("\\s+");
        
        
        reverseArray(words);
        
        
        return String.join(" ", words);
    }
    
    private void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
