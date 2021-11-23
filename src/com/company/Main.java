package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
    String [][] randNumbers = new String[5][6];
    char [] bingo = "bingo".toUpperCase().toCharArray();
    int i = 0;

        for ( char l : bingo) {
            randNumbers[i][0] = String.valueOf(l) ;
            for (int j = 1; j < 6; j++){
                randNumbers[i][j] = "" + (rand.nextInt(16) + i * 15);
            }
            i++;
        }
        randNumbers [2][3] =  "";

        for (int k = 0; k < 6; k++){
            for (int j = 0; j < 5; j++){
                System.out.format("%-3s ", randNumbers[j][k]);
            }
            System.out.println();
        }

    }

}

