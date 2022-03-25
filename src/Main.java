import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        int[] tempArr = new int[intList.size()];
        int couter = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                couter++;
                tempArr[couter] = intList.get(i);
            }
        }
        Arrays.sort(tempArr);
        for (int j = 0; j < tempArr.length; j++) {
            if (tempArr[j] != 0 && tempArr[j] % 2 == 0)
                System.out.println(tempArr[j]);
        }
    }
}
