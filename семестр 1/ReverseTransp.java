import java.util.Scanner;
import java.util.ArrayList;

public class ReverseTransp {
    public static void main(String[] args) {
        ArrayList<int[]> arrList = new ArrayList<int[]>();
        Scanner sc1 = new Scanner(System.in);
        int max_cnt = 0;
        while (sc1.hasNextLine()) {
            int cnt = 0;
            int buff = 0;
            String str = sc1.nextLine();
            Scanner sc2 = new Scanner(str);
            while (sc2.hasNextInt()) {
                buff = sc2.nextInt();
                cnt++;

            }
            max_cnt = Math.max(max_cnt, cnt);
            Scanner sc3 = new Scanner(str);
            int[] numArr = new int[cnt];
            if (cnt != 0) {
                for (int i = 0; i < cnt; i++) {
                    numArr[i] = sc3.nextInt();
                }
            }
            arrList.add(numArr);
        }
        sc1.close();

        for (int i = 0; i < max_cnt; i++) {
            for (int j = 0; j < arrList.size(); j++) {
                if (i < arrList.get(j).length && arrList.get(j)[i] % 2 != 0) {
                    System.out.print(arrList.get(j)[i] + " ");
                }
            }
            System.out.println();

        }
    }
}
