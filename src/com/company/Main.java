package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    private  static  boolean CheckIsPrimeNumber(int number){//проверка простое ли число или нет
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag) return true;//простое
        else return  false;//не простое
    }

    public static void main(String[] args) {
        double result;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int TempNumber;
        String str="",maxStr="";
        boolean FirstStr=false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Табуляция функции");
        System.out.print("Результати функции: ");
        for (float i=-1.0f;i<=1.0f;i+=0.2f){
            result = (1/Math.pow(Math.sin(i),i))+(1/Math.pow(Math.cos(i),i));
            if(!Double.isNaN(result)){
                System.out.print(result+"\t");
            }
        }
        System.out.println();
        try {
            for (byte i=0;i<3;i++){
                System.out.print("Введите число №"+(i+1)+": ");
                TempNumber = Integer.parseInt(reader.readLine());
                if(CheckIsPrimeNumber(TempNumber)) list.add(TempNumber);
            }
            System.out.print("Простые числа: ");
            for (var elem: list) {
                System.out.print(elem+"\t");
            }
            System.out.println();
        }
        catch (Exception ex){
            System.out.print("Непрвильный формат ввода!");
        }
        System.out.println("Введите строки: ");
        do{
            try {
                str = reader.readLine();
                if(!FirstStr) {
                    maxStr = str;
                    FirstStr = true;
                }
                else{
                    if(str.length()>maxStr.length()){
                        maxStr = str;
                    }
                }
            }
            catch (Exception ex){
                System.out.println("Введите корректный рядок");
            }

        }while(str.compareTo("done")<0 || str.compareTo("done")>0);
        System.out.println("Самый долгий рядок: "+maxStr);

    }
}
