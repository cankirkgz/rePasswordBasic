import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String correctPassword = "correct123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen şifrenizi giriniz: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(correctPassword)) {
            System.out.print("Şifreniz doğru. Şifrenizi sıfırlamak istiyor musunuz? (evet/hayır): ");
            String resetChoice = scanner.nextLine();

            if (resetChoice.equalsIgnoreCase("evet")) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                String newPassword = scanner.nextLine();

                if (newPassword.equals(correctPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Girdiğiniz şifre yanlış.");
        }
    }
}