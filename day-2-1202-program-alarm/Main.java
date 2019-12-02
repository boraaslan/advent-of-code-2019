package com.company;

import java.util.Arrays;

public class Main {

    static int[] IntCode  ={1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,2,9,19,23,2,23,10,27,1,6,27,31,1,31,6,35,2,35,10,39,1,39,5,43,2,6,43,47,2,47,10,51,1,51,6,55,1,55,6,59,1,9,59,63,1,63,9,67,1,67,6,71,2,71,13,75,1,75,5,79,1,79,9,83,2,6,83,87,1,87,5,91,2,6,91,95,1,95,9,99,2,6,99,103,1,5,103,107,1,6,107,111,1,111,10,115,2,115,13,119,1,119,6,123,1,123,2,127,1,127,5,0,99,2,14,0,0};
    
    public static void main(String[] args) {
        System.out.println(Run1202IntCode());
        findAllPairsOfInputs();

    }

    /*
        This function finds and prints all of the noun and verbs pairs.
    */
    private static void findAllPairsOfInputs(){
        for (int i=0;i<=99;i++)
            for (int j=0;j<=99;j++)
                System.out.println((i*100 + j) + " - " + RunIntCodeWithParameters(i,j));
    }

    /*
        This function is for run specific noun&verb program on IntCode for part one
    */
    private  static int RunIntCodeWithParameters(int noun, int verb){
        int[] tempIntCode= Arrays.copyOf(IntCode,IntCode.length);
        tempIntCode[1]=noun;
        tempIntCode[2]=verb;
        for (int i=0;i<tempIntCode.length;i=i+4){
            int opCode=tempIntCode[i];
            int pos1=tempIntCode[i+1];
            int pos2=tempIntCode[i+2];
            int pos3=tempIntCode[i+3];
            if(opCode==1)
                tempIntCode[pos3]=tempIntCode[pos1]+tempIntCode[pos2];
            else if(opCode==2)
                tempIntCode[pos3]=tempIntCode[pos1]*tempIntCode[pos2];
            else if(opCode==99)
                break;
            else
                System.err.println("Something is wrong with code!");
        }
        return tempIntCode[0];
    }

    /*
        This function is for run 1202 program on IntCode for part one
    */
    private  static int Run1202IntCode(){
        int[] tempIntCode= Arrays.copyOf(IntCode,IntCode.length);
        tempIntCode[1]=12;
        tempIntCode[2]=2;
        for (int i=0;i<tempIntCode.length;i=i+4){
            int opCode=tempIntCode[i];
            int pos1=tempIntCode[i+1];
            int pos2=tempIntCode[i+2];
            int pos3=tempIntCode[i+3];
            if(opCode==1)
                tempIntCode[pos3]=tempIntCode[pos1]+tempIntCode[pos2];
            else if(opCode==2)
                tempIntCode[pos3]=tempIntCode[pos1]*tempIntCode[pos2];
            else if(opCode==99)
                break;
            else
                System.err.println("Something is wrong with code!");
        }
        return tempIntCode[0];
    }

    /*
    * This function is for print the specific IntCode
    */
    private  static void PrintIntCode(int[] code){
        for (int i=0;i<code.length;i++){
            if(i%4==0)
                System.out.println();
            System.out.print(code[i]+ "\t");
        }
    }



}
