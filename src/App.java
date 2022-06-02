import model.Kubus;
import model.Lingkaran;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di \"Kuliah PBO ";
        int tahun = 2022;
        System.out.println(pesan + tahun+"\"");
        System.out.print("============================\n");
        //definisi variabel untuk menerima masukan keyboard
        Scanner keyboard = new Scanner(System.in);

      
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.r=100;


       
        String yn="";
        do{
            System.out.println("Program Bangun Ruang");
            System.out.println("1. Lingkaran ");
            System.out.println("2. Kubus");
            System.out.println("3. keluar");
            System.out.print("Pilihan (1/2/3) ");
            int pilihan=0;
            pilihan = keyboard.nextInt();
//switch case 
            if(pilihan==1){ //jika 1 lingkaran
              menuLingkaran(keyboard);
            }
            else if(pilihan==2){ //jika 2 kubus
               menuKubus(keyboard);
            }
            else if(pilihan==3) break;
            System.out.print("Apakah Anda ingin kembali ke menu utama? (y/n)");
           
            yn = keyboard.next(); 

            //clear screen
           bersihkanLayar();
        }while(yn.equalsIgnoreCase("y"));

        System.out.println("Terima Kasih");
    }

    public static void bersihkanLayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void menuKubus(Scanner keyboard){
        //kubus
        Kubus kubus1 = new Kubus();

        System.out.print("Masukkan Panjang sisi kubus (s) : ");
        //terima masukan keyboard dari scanner ke r
        kubus1.s= keyboard.nextInt();
        //panggil luas dan volume kubus
        kubus1.tampilkanLuas();
        kubus1.tampilkanVolume();
    }

    public static void menuLingkaran(Scanner keyboard){
        //lingkaran
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.r=10;
        System.out.print("Masukkan Panjang jari-jari (r) : ");
        //terima masukan keyboard dari scanner ke r
        lingkaran1.r= keyboard.nextInt();
        //panggil luas lingkaran
        lingkaran1.luasLingkaran();
    }

}
