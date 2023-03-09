import java.util.Scanner;

public class test {
    public static  void  main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int row,column;
        System.out.println("mayin tarlasına hoşgeldiniz :)");
        //  System.out.println("oynamak istediğiniz boyutları giriniz");
        //System.out.println("satır sayısı:");
        //row = scan.nextInt();
        //System.out.print("sütun sayısı");
        //column = scan.nextInt();

        mayin mayin = new mayin(5,5);
        mayin.run(); //ekrana bastırılanı çalıştırmak için
    }
}
