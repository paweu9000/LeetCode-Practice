class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] temp = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int index = Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
            temp[index-1] = arr[i];
        }
        String result = "";
        for(int i = 0; i < temp.length; i++) {
            for(int j = 0; j < temp[i].length()-1; j++) {
                result += temp[i].charAt(j);
            }
            if(i != temp.length-1) result += " ";
        }
        return result;
    }
}