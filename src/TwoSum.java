import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    /**
     *
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * */


    //-----------> Solution 1--------------------------------
    public int[] getTwoSum(int[] nums,int target){
        Map<Integer,Integer> indices = new HashMap<>();
        for (int i = 0; i <  nums.length; i ++ ){
            int complement = target - nums[i];
            if (indices.containsKey(complement)){
                return  new int[] {indices.get(complement),i};
            }
            indices.put(nums[i],i);
        }
        throw new IllegalArgumentException("No possible Solution found!");
    }
    //-----------> End of Solution 1--------------------------------




    //-----------> Solution Two -----------------------
    public List<Integer> getSum(List<Integer> nums,Integer target){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i ++){
            for (int y = 0; y < nums.size(); y++){
                if (nums.get(i) != nums.get(y)){
                    if (nums.get(i) + nums.get(y) == target){
                        result.add(i);
                        result.add(y);
                        return result;
                    }
                }
            }
        }
        throw new IllegalArgumentException("No possible Solution found!");
    }
    //-----------> End of Solution two


    //-----------> Solution 3 --------------------------------------
    public int[] getTwoSum2(int[] nums,int target){

        for (int i = 0; i < nums.length; i ++){
            for (int j = i + 1; j < nums.length; j ++){
                if( nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No possible solution found!");
    }


    //----------->End of Solution 3 --------------------------------------











}
