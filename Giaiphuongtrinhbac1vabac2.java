import java.util.Scanner;

public class Giaiphuongtrinhbac1vabac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon loai phuong trinh muon giai: ");
        System.out.println("Phuong trinh bac 1 (ax + b = 0)");
        System.out.println("Phuong trinh bac 2 (ax^2 + bx + c = 0)");
        int choice = sc.nextInt();

        if (choice == 1) {
//            Neu chon 1 se giai phuong trinh bac 1
            System.out.print("Hay nhap gia tri a: ");
            double a = sc.nextDouble();
            System.out.print("Hay nhap gia tri b: ");
            double b = sc.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");

                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                double x = -b / a;
                System.out.println("Nghiem cua phuong trinh la: x = " + x);


            }
        } else if (choice == 2) {
//            Neu chon 2 se giai phuong trinh bac 2
                System.out.println("Hay nhap gia tri a: ");
                double a = sc.nextDouble();
                System.out.println("Hay nhap gia tri b: ");
                double b = sc.nextDouble();
                System.out.println("Hay nhap gia tri c: ");
                double c = sc.nextDouble();

                double dental = Math.pow(b, 2) - (4 * a * c);
//            tinh dental de giai phuong trinh bac 2
                if (dental < 0) {
                    System.out.println("Phuong trinh vo nghiem.");

                } else if (dental == 0) {
                    double x = -b / 2 * a;
                    System.out.println("Phuong trinh co nghiem kep la: x = " + x);

                } else if (dental > 0) {
                    double x1 = (-b + Math.sqrt(dental)) / (2 * a);
                    double x2 = (-b - Math.sqrt(dental)) / (2 * a);
                    System.out.println("Phuong trinh co nghiem x1 = " + x1);
                    System.out.println("Phuong trinh co nghiem x2 = " + x2);


                }
            } else {
                System.out.println("Lua chon khong hop le.");
            }
            sc.close();
        }
    }

