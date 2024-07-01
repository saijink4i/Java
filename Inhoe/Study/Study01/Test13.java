package Inhoe.Study.Study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test13 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        char[] template = {'A', 'C', 'G', 'T'};

        int count = 0;
        int max = 0;
        for(int i=0 ; i<text.length() ; i++) {
            boolean check = true;
            for(int j=0 ; j<template.length ; j++) {
                if(template[j] == text.charAt(i)){
                    count++;
                    check = false;
                    break;
                }
            }

            if(check || i == text.length()-1){
                if(max < count){
                    max = count;
                }
                count = 0;
            }
        }

        System.out.println(max);
    }
}
