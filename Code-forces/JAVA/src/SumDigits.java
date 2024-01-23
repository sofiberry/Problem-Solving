import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        int answer = 0;
        char [] nums = num.toCharArray();
        if(nums.length == 1) {
            System.out.println('0') ;
            return;
        }
        for(int i=0; i<nums.length; i++) {
            answer += nums[i] - '0';
        }
        int counter = 1;
        while(answer>=10) {
            answer = sum(answer);
            counter++;
        }
        System.out.println(counter);

    }
    public static int sum(int num) {
        int result = 0;
        while (num != 0 ) {
            result += num%10;
            num /= 10;
        }
        return result;
    }
}
