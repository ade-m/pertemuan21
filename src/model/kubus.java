package model;

public class kubus {
    public int s =0;
    public int hitungLuas(){
         //6 * s2 10 => 600  100 60000
         //int luas = 6 *(s*s);
         return 6 *(s*s);//luas;
    }
    public int hitungVolume(){
        // s x s x s
        return s*s*s;
    }
    public void tampilkanLuas(){
        System.out.println("Luas Permukaan Kubus s="+s+"cm");
        System.out.println("Luas = "+ hitungLuas());
    }
    public void tampilkanVolume(){
        System.out.println("Volume  Kubus s="+s+"cm");
        System.out.println("Volume = "+ hitungVolume());
    }
}
