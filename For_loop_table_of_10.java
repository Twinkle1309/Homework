package agelimit;

public class For_loop_table_of_10 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {


                if (i != 10) {
                    System.out.println("10*" + (i + 0) + "=" + i * 10);
                    i++;
                } else if (j != 10) {
                    System.out.println("10*" + (j + 1) + "=" + j * 10);
                    j++;
                }

            }
        }
    }
}
