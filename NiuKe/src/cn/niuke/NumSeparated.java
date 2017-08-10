package cn.niuke;

/*
题目描述 ：给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 
        A1 = 能被5整除的数字中所有偶数的和；
        A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
        A3 = 被5除后余2的数字的个数；
        A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
        A5 = 被5除后余4的数字中最大数字。
输入描述：每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。
输出描述：对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
                   若其中某一类数字不存在，则在相应位置输出“N”。
example：输入 :13 1 2 3 4 5 6 7 8 9 10 20 16 18
                     输出 :30 11 2 9.7 9
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumSeparated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int sum0 = 0;
    	int sum1 = 0;
    	int sum2 = 0;
    	float sum3 = 0;
    	int sum4 = 0;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();

        int N;
        int i = 0;
    	Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        while(i<N){
        	int j =scanner.nextInt();
			int m = j%5;
			if(m == 0 && j%2 == 0){
				sum0+=j;
			}
			if (m == 1) {
				list1.add(j);
			}			
			if (m == 2) {
				sum2++;
			}
			if (m == 3) {
				list3.add(j);
			}			
			if (m == 4) {
				list4.add(j);
			}			
        	i++;
        }
        sum1 = sum1(list1);
        sum3 = sum3(list3);
        float sum33 = (float)(Math.round(sum3*10))/10;
        sum4 = sum4(list4);
        System.out.println((sum0==0?"N":sum0)+" "
        		+(sum1==0?"N":sum1)+" "
        		+(sum2==0?"N":sum2)+" "
        		+(sum3==0?"N":sum33)+" "
        		+(sum4==0?"N":sum4)
        		);
        scanner.close();
	}	

//	List<Integer> num = new ArrayList<Integer>();
//	public static void separated(int j){
//
////			int m = index%5;
////
////			if(m == 0 && j%2 == 0){
////				sum0+=j;
////			}
////			if (m == 1) {
////				list1.add(j);
////			}
////			sum1 = sum1(list1);
////			if (m == 2) {
////				sum2++;
////			}
////			if (m == 3) {
////				list3.add(j);
////			}
////			sum3 = sum3(list3);
////			if (m == 4) {
////				list4.add(j);
////			}
////			sum4 = sum4(list4);
//	}
//	public static void print(int i){
//		if(i==0){
//			System.out.print("N"+" ");
//		}else{
//			System.out.print(i+" ");
//		}
//	}
	/*
	 * 交错求和
	 */
	public static int sum1(List<Integer> list){
		if(list.size()==0){
			return 0;
		}
		if(list.size()==1){
			return list.get(0);
		}
		int sum = 0;
		for(int i = 0; i<list.size();i++){
			if(i%2==0){
				sum+=list.get(i);
			}else{
				sum-=list.get(i);
			}
		}
		return sum;
	}
	/*
	 * 平均数
	 */
	public static float sum3(List<Integer> list){
		if(list.size()==0){
			return 0;
		}
		if(list.size()==1){
			return list.get(1);
		}
		float sum = 0;
		for(Iterator<Integer> it = list.iterator();it.hasNext();){
			sum+=it.next();
		}			
		return sum/list.size();
	}
	/*
	 * 最大数字
	 */
	public static int sum4(List<Integer> list){
		if(list.size()==0){
			return 0;
		}
		if(list.size()==1){
			return list.get(0);
		}
		for(int i = 0;i<list.size()-1;i++){
		    if(list.get(i)>list.get(i+1)){
		    	list.set(i+1, list.get(i));
		    }		    
		}
		return list.get(list.size()-1);
	}
//	public int swap(int n,int m){
//		if(n > m){
//			return n;
//		}else{
//			return m;
//		}
//	}

}