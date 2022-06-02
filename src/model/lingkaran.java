package model;
public class Lingkaran {
    public int r=10;
    public final double PI = 22.0/7;
    public void luasLingkaran(){
        System.out.println("Cetak Luas Lingkaran r="+r+"cm");
        double A = PI*Math.pow(r, 2);
        System.out.println("Nilai PI = "+ PI);
        System.out.println("Luas Lingkaran = "+ A);
    }
}
