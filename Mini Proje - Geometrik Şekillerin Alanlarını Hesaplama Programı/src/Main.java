
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String islemler ="1.Kare hesaplama\n"
                + "2.Ucgen hesaplama\n"
                + "3.Daire hesaplama\n"
                + "q çıkış";
        
        Scanner input =new Scanner(System.in);
        Sekil sekil=null;
        while(true){
            System.out.println(islemler);
            System.out.println("bir adet secim giriniz:");
            String cevap=input.nextLine();
            
            if(cevap.equals("q")){
                System.out.println("Programdan çıkılıyor..");
                break;
            }
            else if(cevap.equals("1")){
                System.out.println("Bir adet kenar giriniz");
                int a=input.nextInt();
                input.nextLine();
                sekil = new Kare("kare1", a);
                sekil.alanHesapla();
            }
            else if(cevap.equals("2")){
                System.out.println("3 adet kenar giriniz");
                int a=input.nextInt();
                int b=input.nextInt();
                int c=input.nextInt();
                input.nextLine();
                sekil =new Ucgen("ucgen1", a, b, c);
                sekil.alanHesapla();
            }
            else if(cevap.equals("3")){
                System.out.println("yariçap giriniz");
                int a=input.nextInt();
                input.nextLine();
                sekil  =new Daire("daire1", a);
                sekil.alanHesapla();
            }
            else{
                System.out.println("hatali giriş yaptiniz");
            }
            
        }
    }
}
