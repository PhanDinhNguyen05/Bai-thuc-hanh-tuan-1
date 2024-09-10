package Tuan1;

public class HinhChuNhat {
	//khai bao cac thuoc tinh
	private double chieuDai;
	private double chieuRong;
	//dong goi
	public double getChieuDai() {
		return chieuDai;
	}
	//rang buoc
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi");
		}
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r<=0) {
			System.out.println("loi");
		} else {
			this.chieuRong = r;
		}
		
	}
	//constructor (ham tao) dung khoi ntao doi tuong (new)
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi");
		}
		if (r<=0) {
			System.out.println("loi");
		} else {
			this.chieuRong = r;
		}
	}
	//phuong thuc
	public double getcv() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getdienTich() {
		return getChieuDai()*getChieuRong();
	}
	//tao mau in tostring
	@Override
	public String toString() {
		String s="";
		s=s+s.format("|%10s|%10s|%10s|%10s|", getChieuDai(), getChieuRong(), getcv(), getdienTich());
		return s;
	}
}
