package com.brillio.training.exercises;

public class BinaryToDecimal {

	public static void main(String[] args) {
		long bNum=1000100000100L;
		int dNum=binaryToDecimal(bNum);
		System.out.println(dNum);
	}

	public static int binaryToDecimal(long bNum) {
		long temp=bNum;
		int dNum=0,i=0;
		while(temp>0){
			long rem=temp%10;
			if(rem>1)
			{
				return -1;
			}
			//System.out.println(rem);
			temp=temp/10;
			//System.out.println("temp="+temp);
			dNum=(int) (dNum+ rem*Math.pow(2,i++));
		}
		return dNum;
	}

}
