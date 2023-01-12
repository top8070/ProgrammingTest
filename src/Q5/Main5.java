package Q5;

public class Main5 {
    public static void main(String[] args) {
        int[][] pond = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        boolean flag;
        do {

            flag = false;
            for (int i = 1; i <= pond.length - 2; i++) {
                for (int j = 1; j <= pond[i].length - 2; j++) {
                    if (pond[i][j] != 0){
                        if (pond[i][j] <= pond[i-1][j] && pond[i][j] <= pond[i+1][j]
                                && pond[i][j] <= pond[i][j-1] && pond[i][j] <= pond[i][j+1]) {
                            pond[i][j]++;
                            flag = true;
                        }
                    }
                }
            }

        } while (flag);

        int total = 0;
        for (int[] ints : pond) {
            for (int anInt : ints) {
                total += anInt;
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        System.out.println("총합 = " + total);

    }
}
