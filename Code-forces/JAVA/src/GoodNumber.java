import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int range = scanner.nextInt();
        int result = 0;
        int counter = 1;
        for(int i=0; i<size; i++) {
            String num = scanner.next();
            for(int j=0; j<num.length(); j++) {
                counter =0;
                for(int k=0; k<=range; k++) {
                    if((num.contains(String.valueOf(k)))) {
                        counter++;
                    }
                }
            }
            if(counter == range + 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
