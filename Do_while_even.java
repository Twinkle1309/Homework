package agelimit;

public class Do_while_even {
    public static void main(String[] args) {
        int i=1;
        do {
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }while (i<=20);
    }
}
