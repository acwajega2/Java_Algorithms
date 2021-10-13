
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        TwoSum twoSum = new TwoSum();


        System.out.println(Arrays.toString(twoSum.getTwoSum(new int[]{3,2,4}, 6)));


        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);



        System.out.println(twoSum.getSum( nums,6));
        System.out.println(Arrays.toString(twoSum.getTwoSum2(new int[]{3, 2, 4}, 6)));

    }

}
