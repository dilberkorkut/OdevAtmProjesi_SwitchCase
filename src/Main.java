import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1500;
        int select;
        int right = 3;

        Scanner input = new Scanner(System.in);

        while(right>0){
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, bankamiza hosgeldiniz!");

                do {
                    System.out.print("1-Para Yatirma\n" + "2-Para Cekme\n" + "3-Bakiye Sorgulama\n" + "4-Cikis Yap\n" );
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1 :
                            System.out.print("Yatirmak istediginiz miktar: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: " +balance);
                            break;
                        case 2 :
                            System.out.print("Cekmek istediginiz tutari giriniz: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yeterli bakiyeniz bulunmamaktadir. ");
                            } else {
                                balance -= price;
                                System.out.print("Yeni bakiyeniz: " + balance + "TL");

                            }
                            break;
                        case 3 :
                            System.out.print("Bakiyeniz :" + balance);
                            break;
                        case 4 :
                            System.out.print("Cikis yaptiniz. Tekrar gorusmek uzere, iyi gunler");
                            break;
                        default:
                            System.out.println("Gecersiz bir secim yaptiniz. Lutfen tekrar deneyiniz.");
                    }
                } while ( select !=4 );
            }else{
                right --;
                System.out.println("hatali giris/tekrar deneyiniz. kalan kakkiniz " +right);


                if(right == 0){
                    System.out.println("Kartiniz bloke olmustur! Bankanizla iletisime geciniz");
                } else {
                    System.out.println("kalan hakkiniz: " + right);
                }
            }

        } while (right > 0);

    }
}