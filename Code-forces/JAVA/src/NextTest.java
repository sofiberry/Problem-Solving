import java.util.Scanner;

public class NextTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSolved = scanner.nextInt();
        int []nums = new int[numSolved];
        int start = 1;
        int result = 0;
        for(int i =0; i<numSolved; i++) {
            nums[i] = scanner.nextInt();
        }
        sortArray(nums);
        for(int i=0; i<numSolved; i++) {
            if(!(nums[i] == start)) {
                break;
            }
            start++;
        }
        System.out.println(start);
    }

    public static void sortArray(int []intArray) {
        int temp = 0;
        for(int i=0; i< intArray.length; i++) {
            for(int j=i+1; j<intArray.length; j++) {
                if(intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
