package com.company;

public class ArrayManager {

    public String[][] storage = new String[26][10];
    //takes the alphabetical list of words and puts them in the 2D array
    public void enterData(String[] wordArray){

        for(int i  = 0; i < wordArray.length; i++){
            //x = charat 0 - 97
            //y = number of preceding words with same charAt 0
            int x = wordArray[i].charAt(0) -97;
            int y = 0;
            //counts number of preceding words with same charAt 0
            for(int j = i-1; j >= 0; j--){
                if(wordArray[i].charAt(0) == wordArray[j].charAt(0)){
                    y++;
                } else j = -1;
            }
            storage[x][y] = wordArray[i];
        }
        System.out.println();
        for(int i = 0; i < 26; i++){
            System.out.println();
            System.out.print("X: "+i);

            for(int j = 0; j < 10; j++){
                System.out.print(" Y: " + j +" "+ storage[i][j]);
            }
        }
    }
}
