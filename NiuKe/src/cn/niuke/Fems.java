package cn.niuke;

import java.util.Scanner;

/*
题目描述：大侦探福尔摩斯接到一张奇怪的字条：“我们约会吧！ 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm”。大侦探很

                   快就明白了，字条上奇怪的乱码实际上就是约会的时间“星期四 14:04”，因为前面两字符串中第1对相同的大写英文字母（大小写有区分）是

                   第4个字母'D'，代表星期四；第2对相同的字符是'E'，那是第5个英文字母，代表一天里的第14个钟头（于是一天的0点到23点由数字0到9、

                    以及大写字母A到N表示）；后面两字符串第1对相同的英文字母's'出现在第4个位置（从0开始计数）上，代表第4分钟。现给定两对字符串，

                   请帮助福尔摩斯解码得到约会的时间

输入描述：输入在4行中分别给出4个非空、不包含空格、且长度不超过60的字符串。
输出描述：在一行中输出约会的时间，格式为“DAY HH:MM”，其中“DAY”是某星期的3字符缩写，即MON表示星期一，TUE表示星期二，WED表示星期三，THU表示星期
                   四，FRI表示星期五，SAT表示星期六，SUN表示星期日。题目输入保证每个测试存在唯一解。
输入例子：3485djDkxh4hhGE
        2984akDfkkkkggEdsb
        s&hgsfdk
        d&Hyscvnm
输出例子： THU 14:04         
 */
public class Fems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
//		String str1 = "3485djDkxh4hhGE";
//		String str2 = "2984akDfkkkkggEdsb";
//		String str3 = "s&hgsfdk";
//		String str4 = "d&Hyscvnm";
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str3 = scanner.nextLine();
		String str4 = scanner.nextLine();
		String[] str = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};

		int i = 0;
		for(;i<60;i++){
			if(str1.charAt(i)==str2.charAt(i) && str1.charAt(i)>=65 && str1.charAt(i)<=90){
				int x = str1.charAt(i)-65;
				System.out.print(str[x]+" ");
				break;
			}			
		}
		i+=1;
		for(;i<60;i++){
			if(str1.charAt(i)==str2.charAt(i) 
					&& ((str1.charAt(i)>=48 && str1.charAt(i)<=57) || (str1.charAt(i)>=65 && str1.charAt(i)<=78))
					&& ((str2.charAt(i)>=48 && str2.charAt(i)<=57) || (str2.charAt(i)>=65 && str2.charAt(i)<=78))
					){
				if(str1.charAt(i)<=57){
					int y = str1.charAt(i)-48;
//					System.out.println(str1.charAt(i));
					System.out.print(0);
					System.out.print(y+":");
				}else{
					int y = str1.charAt(i)-55;
//					System.out.println(str1.charAt(i));
					System.out.print(y+":");
				}
				break;
			}
		}
		for(int j = 0;j<60;j++){
			if(str3.charAt(j)==str4.charAt(j) && str3.charAt(j)>=97 && str3.charAt(j)<=122){
				if(j<10){
					System.out.print(0);
					System.out.print(j);
				}else{
				System.out.print(j);
				}
				break;
			}
		}
	}
}
/*
 import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str3 = scanner.nextLine();
		String str4 = scanner.nextLine();
		String[] str = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
		int i = 0;
		for(;i<60;i++){
			if(str1.charAt(i)==str2.charAt(i) && str1.charAt(i)>=65 && str1.charAt(i)<=90){
				int x = str1.charAt(i)-65;
				System.out.print(str[x]+" ");
				break;
			}			
		}
		i+=1;
		for(;i<60;i++){
			if(str1.charAt(i)==str2.charAt(i) 
					&& ((str1.charAt(i)>=48 && str1.charAt(i)<=57) || (str1.charAt(i)>=65 && str1.charAt(i)<=78))
					&& ((str2.charAt(i)>=48 && str2.charAt(i)<=57) || (str2.charAt(i)>=65 && str2.charAt(i)<=78))
					){
				if(str1.charAt(i)<=57){
					int y = str1.charAt(i)-48;
					System.out.print(0);
					System.out.print(y+":");
				}else{
					int y = str1.charAt(i)-55;
					System.out.print(y+":");
				}
				break;
			}
		}
		for(int j = 0;j<60;j++){
			if(str3.charAt(j)==str4.charAt(j) && str3.charAt(j)>=97 && str3.charAt(j)<=122){
				if(j<10){
					System.out.print(0);
					System.out.print(j);
				}else{
				System.out.print(j);
				}
				break;
			}
		}
	}
}
 */
