package Tuan1;

import java.util.Scanner;

public class TestHCN {
	public static void inTD() {System.out.printf("|");
		for (int i = 0; i < 43; i++) {
			System.out.printf("-");
		}System.out.printf("|");
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
		System.out.println();
		System.out.printf("|");
		for (int i = 0; i < 43; i++) {
			System.out.printf("-");
		}
		System.out.printf("|");
		System.out.println();
	}
	public static HinhChuNhat nhapMem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		double d= sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		double r= sc.nextDouble();
		HinhChuNhat h1= new HinhChuNhat();
		h1.setChieuDai(d);
		h1.setChieuRong(r);
		return h1;
	}
	
	public static void main(String[] args) {
		// khoi tao doi tuong h1 HCN
		HinhChuNhat h1= new HinhChuNhat();
		h1.setChieuDai(10);
		h1.setChieuRong(5);
		inTD();
		System.out.println(h1.toString());
		System.out.printf("|");
		for (int i = 0; i < 43; i++) {
			System.out.printf("-");
		}System.out.printf("|");
		System.out.println();
		//khoi tao doi tuong co doi so
		HinhChuNhat h2= new HinhChuNhat(70,50);
		inTD();
		System.out.println(h2.toString());
		System.out.printf("|");
		for (int i = 0; i < 43; i++) {
			System.out.printf("-");
		}System.out.printf("|");
		System.out.println();
		nhapMem();
		inTD();
	}
}
