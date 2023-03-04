package agelimit;

import sun.awt.geom.AreaOp;

public class Age {
    public static void main(String[] args) {
        int age=15;

        if(age>=18){
            System.out.println("Candidate is eligible for voting");
        }
        else{
            System.out.println("Candidate is not eligible for voting");
        }

    }
}
