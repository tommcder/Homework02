package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

    	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    	System.out.print("Enter the first time: ");
    	String t1 = read.readLine();
    	System.out.println("Enter the second time: ");
    	String t2 = read.readLine();

    	int t1Hrs = Integer.parseInt(t1.substring(0,2));
    	int t1Mns = Integer.parseInt(t1.substring(3,5));

		int t2Hrs = Integer.parseInt(t2.substring(0,2));
		int t2Mns = Integer.parseInt(t2.substring(3,5));

		t1Mns = t1Hrs*60 + t1Mns;
		t2Mns = t2Hrs*60 + t2Mns;

		int totTime = t2Mns-t1Mns +1440;
		totTime = totTime%1440;

		int finalHrs = (int)(totTime/60);
		int finalMns = totTime%60;

		System.out.println(finalHrs+" hours and "+finalMns+" minutes.");

    }
}
