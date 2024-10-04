import java.util.Scanner;
import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<int[]> arrList = new ArrayList<int[]>();
        Scanner sc1 = new Scanner(System.in);

        while (sc1.hasNextLine()) {
            int cnt = 0;
            int buff = 0;
            String str = sc1.nextLine();
            Scanner sc2 = new Scanner(str);

            while (sc2.hasNextInt()) {
                buff = sc2.nextInt();
                cnt++;
            }

            Scanner sc3 = new Scanner(str);
            int[] numArr = new int[cnt];
            if (cnt != 0) {
                for (int i = 0; i < cnt; i++) {
                    numArr[i] = sc3.nextInt();
                }
            }
            arrList.add(numArr);
        }
        for (int i = arrList.size() - 1; i >= 0; i--) {
            int[] numArr = arrList.get(i);
            if (numArr.length == 0) {
                System.out.print(" ");
            } else {
                for (int j = numArr.length - 1; j >= 0; j--) {
                    System.out.print(numArr[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
