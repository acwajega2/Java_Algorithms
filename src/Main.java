
import org.junit.Test;


import static org.junit.Assert.*;

public class Main {

    public static void main(String[] args)  {

//        TwoSum twoSum = new TwoSum();
//
//        System.out.println(Arrays.toString(twoSum.getTwoSum(new int[]{3,2,4}, 6)));
//        List<Integer> nums = new ArrayList<>();
//        nums.add(3);
//        nums.add(2);
//        nums.add(4);
//        System.out.println(twoSum.getSum( nums,6));
//        System.out.println(Arrays.toString(twoSum.getTwoSum2(new int[]{3, 2, 4}, 6)));
//        MainTesting mainTesting = new MainTesting();
//        mainTesting.algorithmTests();




    }

    public static class MainTesting {

        private TwoSum twoSum = new TwoSum();
        private LongestSubstring longestSubstring = new LongestSubstring();
        @Test
        public void algorithmTests(){

            assertTrue("Test fails",twoSum.addNumbers(2,3) == 5);
            assertTrue("Test fails",twoSum.addNumbers(6,3) == 9);

            //-----------> Two Sum Test Case
            assertArrayEquals(twoSum.getTwoSum(new int[]{3,2,4}, 6),new int []{1,2}  );

            //-----------> Longest Sub string test Caase
            assertEquals(longestSubstring.longestSubstring("ABDEFGABEF"),6);
            assertEquals(longestSubstring.longestSubstring("GEEKSFORGEEKS"),7);
            assertEquals(longestSubstring.longestSubstring("BBBB"),1);

        }

    }



}
