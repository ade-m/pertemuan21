import model.lingkaran;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di \"Kuliah PBO ";
        int tahun = 2022;
        System.out.println(pesan + tahun+"\"");
        System.out.print("============================\n");
        //definisi variabel untuk menerima masukan keyboard
        Scanner keyboard = new Scanner(System.in);

        lingkaran lingkaran1 = new lingkaran();

       
        String yn="";
        do{
            System.out.print("Masukkan Panjang jari-jari (r) : ");
            //terima masukan keyboard dari scanner ke r
            lingkaran1.r= keyboard.nextInt();
            //panggil luas lingkaran
            lingkaran1.luasLingkaran();

            System.out.print("Apakah Anda ingin menghitung luas lingkaran lagi? (y/n)");
           
            yn = keyboard.next(); 
            
        }while(yn.equalsIgnoreCase("y"));

        System.out.println("Terima Kasih");
    }

}
