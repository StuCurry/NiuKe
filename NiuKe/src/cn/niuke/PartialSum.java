package cn.niuke;

import java.util.Scanner;

/*
 * A B 部分求和
题目描述：正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
                   现给定A、DA、B、DB，请编写程序计算PA + PB。
输入描述：输入在一行中依次给出A、DA、B、DB，中间以空格分隔，其中0 < A, B < 10^10
输出描述；在一行中输出PA + PB的值
输入例子：3862767 6 13530293 3
输出例子：399                   
 */
public class PartialSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String A = in.next();
	    String DA = in.next();
	    String B = in.next();
	    String DB = in.next();
//		long A = 3862767;
//		Integer DA = 6;
//		long B = 13530293;	
//		Integer DB = 3;
		System.out.println(pSum(A, DA)+pSum(B, DB));
//		String strA = String.valueOf(A);
//		String DA1 = String.valueOf(DA);
//		String strB = String.valueOf(B);
//		String DB1 = String.valueOf(DB);
//		String[] ArrstrA = strA.split(DA1);
//		String[] ArrstrB = strB.split(DB1);
	}
	public static long pSum(String A,String DA){
//		String strA = String.valueOf(A);
//		String DA1 = String.valueOf(DA);
		String[] ArrstrA = A.split(DA);
		int sum = 0;
		for(int i = 0;i<ArrstrA.length;i++){
			sum+=ArrstrA[i].length();
		}
		int sumDA = A.length()-sum;
		String DA2 = "";
		if(sumDA == 0){
			return 0;
		}
		while(sumDA>0){
			DA2 = DA2 + DA;
			sumDA--;
		}
		return Long.parseLong(DA2);
	}
}
