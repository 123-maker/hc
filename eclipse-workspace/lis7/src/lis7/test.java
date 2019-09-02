package lis7;


	import java.util.Scanner;

	public class test {

	 public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  String str = sc.nextLine();
	  
	  String result = getRes(str);
	  
	  System.out.println(result);
	 }

	 private static String getRes(String str) {
	  int len = 1;
	  StringBuffer sb = new StringBuffer();
	  
	  String[] arr = str.split(" ");
	  
	  for(int i=1;i<arr.length;i++){
	   if(arr[i].equals("A")){
	    len+=2;
	    sb.append("12");
	    sb.append(" ");
	    sb.append("34");
	   }else if(arr[i].equals("B")){
	    len+=2;
	    sb.append("AB");
	    sb.append(" ");
	    sb.append("CD");
	   }else{
	    len+=1;
	    sb.append(arr[i]);
	    sb.append(" ");
	   }
	  }
	  
	  String length = len+"";
	  
	  String res = length+" "+sb.toString().trim();
	  
	  return res;
	 }

	}

