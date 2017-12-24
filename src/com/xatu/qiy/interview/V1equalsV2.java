/**
 * 题目1:
 * 对于任意两个正整数x和k，我们定义repeat(x，k)为将x重复写k次形成的数，
 * 例如repeat(1234,3)=123412341234，repeat(20,2)=2020
 * 现在给出4个整数x1，k1，x2.k2，其中v1=(x1,k1),v2=(x2,k2),请
 * 比较v1和v2的大小
 */
package com.xatu.qiy.interview;

import java.util.Scanner;

/**
 * @author mz 2017-12-24
 */
public class V1equalsV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 接收x1，x2，k1，k2的值
		long x1 = sc.nextInt();
		long k1 = sc.nextInt();
		long x2 = sc.nextInt();
		long k2 = sc.nextInt();
		// 数据处理
		long v1 = repeat(x1, k1);
		long v2 = repeat(x2, k2);
		if(v1==v2) {
			System.out.println("v1==v2");
		}
		else if(v1>v2) {
			System.out.println("v1>v2");
		}
		else {
			System.out.println("v1<v2");
		}
	}

	/**
	 * @param x
	 * @param k
	 * repeat(x，k)为将x重复写k次形成的数
	 * @return
	 */
	private static long repeat(long x, long k) {
		long v = 0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<k;i++) {
			sb.append(x);
		}
		v = Integer.parseInt(sb.toString());
		return v;
	}
}
