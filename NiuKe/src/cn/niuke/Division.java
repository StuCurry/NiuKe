package cn.niuke;

/*
 * A除以B
题目描述:本题要求计算A/B，其中A是不超过1000位的正整数，B是1位正整数。你需要输出商数Q和余数R，使得A = B * Q + R成立。
输入描述：输入在1行中依次给出A和B，中间以1空格分隔。
输出描述：在1行中依次输出Q和R，中间以1空格分隔。
输入例子：123456789050987654321 7
输出例子：17636684150141093474 3
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		scanner.close();
//		String A = scanner.next();
//		String B = scanner.next();   1763668415001855379188 5
//		BigInteger a = new BigInteger("123456789050987654321");
//		BigInteger b = new BigInteger("7");
//		BigInteger a = new BigInteger(A);   字符串转成BigInteger 需要通过BigInteger的构造方法
//		BigInteger b = new BigInteger(B);
		BigInteger q = a.divide(b);
		BigInteger r = a.remainder(b);
		System.out.print(q+" "+r);
	}
}

//	    int R = 0;
//	    public static void  main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        String A = sc.next();
//	        int B = sc.nextInt();
//	        bigDiv(A, B);
//	    }
//	    static void bigDiv(String A,int B){
//	        StringBuffer Q = new StringBuffer();
//	 
//	        char[] cA = A.toCharArray();
//	        int r = 0;
//	        int a = 0;
//	        for (int i = 0; i < cA.length; i++) {
//	            a = r * 10 + Integer.parseInt(String.valueOf(cA[i]));  //这应该是一种规律解法  
//	            Q.append(a/B);
//	            r = a % B;
//	        }
//	        while (Q.charAt(0)=='0')Q.delete(0,1);
//	        System.out.println(Q.toString()+" "+r);
//	    }
//	 
//	}