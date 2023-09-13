import java.util.Scanner;
public class UcgeninAlaniniHesaplayanProgram {
    public static void main(String[]args){
        //Değerleri oluşturalım
        int kenar1,kenar2,kenar3;
        double alan,cevre;
        //Kullanıcı veri girsin
        Scanner input=new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        kenar1=input.nextInt();
        System.out.print("2.kenarı giriniz: ");
        kenar2=input.nextInt();
        System.out.print("3.kenarı giriniz: ");
        kenar3=input.nextInt();
        double u=(kenar1+kenar2+kenar3)/2.0;
        cevre=2*u;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println(cevre);
        System.out.println(alan);
    }
}
