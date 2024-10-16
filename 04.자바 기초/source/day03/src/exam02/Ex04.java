package exam02;

public class Ex04
{
    public static void main(String[] args)
    {
        //int[] nums = {10, 20, 30, 40}; // 배열의 선언과 동시에 초기화
        int[] nums = {10, 20, 30, 40, 50, 60};

        System.out.printf("length = %d%n마지막 숫자 = %d%n",
                nums.length, nums[nums.length - 1]); // 배열 공간 갯수

        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        for (int num : nums) // 향상된 for문
        {
            System.out.println(num);
        }
    }
}