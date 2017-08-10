package cn.niuke;
/*
题目描述：请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

/*answer1
public class Solution {
    public static String replaceSpace(StringBuffer str) {
 
        return str.toString().replaceAll(" ","%20");
    }
}
*/
public class ReplaceSpace {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer(" we  are happy ");
		System.out.println(replaceSpace(sb));
//		System.out.println(sb.charAt(7)+"aaa");
	}
	 public static String replaceSpace(StringBuffer str){
//		 str.setCharAt(1, 'd');
//		 str.setLength(10);
		 int count = 0;
		 for(int i = 0; i<str.length();i++){
			 if(str.charAt(i) == ' '){
				 count++;
			 }
		 }
		 int start = str.indexOf(" ");
		 int end = str.length()-1;
		 int newlength = str.length()+count*2;
		 str.setLength(newlength);
		 for(;end>=start;end--){
			 if(str.charAt(end)!=' '){
				 str.setCharAt(--newlength, str.charAt(end));
			 }else{
				 str.setCharAt(--newlength, '0');
				 str.setCharAt(--newlength, '2');
				 str.setCharAt(--newlength, '%');
			 }
		 }
		 return str.toString();
	 }
}

