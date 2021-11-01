public class LongestSubstring {
    /***
     *
     * Given a string str, find the length of the longest substring without repeating characters.
     *
     * For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
     * For “BBBB” the longest substring is “B”, with length 1.
     * For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7
     *
     * ***/

    public int longestSubstring(String word){
        StringBuilder result = new StringBuilder();
       if (word.length() > 0){
          String[] str = word.split("");
          for (String s : str){
              if (!result.toString().contains(s)){
                  result.append(s);
              }
          }
          return result.length();
       }
       throw new IllegalArgumentException("please provide a valid string!");
    }
}
