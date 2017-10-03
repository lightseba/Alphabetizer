package com.company;

public class OrtizArray {
    //ortiz said to make my array variable length even though the assignment said to make it fixed

    public void enterData(String[] wordArray){

        //counts the number of distinct first characters assuming alphabetical input
        int xCount = 0;
        int highestChar = 0;
        for(int i = 0; i < wordArray.length; i++){
            if(wordArray[i].charAt(0) > highestChar){
                xCount++;
                highestChar = wordArray[i].charAt(0);
            }

        }
        System.out.println(xCount);
        //counts the number of words with the same first character for each x
        //yCount stores correct y (value) for each x (index)
        //xChars stores correct charAt 0 (value) for each x (index)

        int[] yCount = new int[xCount];
        int[] xChars = new int[xCount];
        int currentXpos = 0;
        int currentXval = 0;
        for(int i = 0; i < xCount; i++){
            yCount[i] = 0;
            currentXval = wordArray[currentXpos].charAt(0);
            xChars[i] = currentXval;
            for(int j = currentXpos; j < wordArray.length; j++){
                if(wordArray[j].charAt(0) == currentXval){
                    yCount[i]++;
                } else{
                    currentXpos = j;
                    currentXval = wordArray[j].charAt(0);
                    j = wordArray.length;
                }
            }

        }
        /*for(int i = 0; i < xCount; i++){
            System.out.println(yCount[i]);
        }*/

        //makes 2D array of correct y for each x based of yCount array
        String[][] storage = new String[xCount][];
        for(int i = 0; i < xCount; i++){
            storage[i] = new String[yCount[i]];
            System.out.println("x = "+i+" y = "+yCount[i]);
        }

        //fills out storage array with values
        int lastPos = 0;
        for(int x  = 0; x < xCount; x++){
            int y = -1;
            for(int i = lastPos; i < wordArray.length; i++){
                if(wordArray[i].charAt(0) == xChars[x]){
                    y++;
                    storage[x][y] = wordArray[i];
                } else{
                    lastPos = i;
                    i = wordArray.length;
                }
            }
        }
        for(int i = 0; i  < xCount; i++){
            System.out.println();
            System.out.println("x: "+i);
            for(int j = 0; j < yCount[i]; j++){
                System.out.print("y: "+j+" "+storage[i][j]+" ");
            }
        }
    }
}
