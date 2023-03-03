import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,x=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = input.nextInt();
        System.out.println("Nhập b: ");
        b = input.nextInt();
        a = Math.abs(a); // hàm abs() để trả về giá trị tuyệt đối (phần dương) của a,b
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("Không có ước chung lớn nhất!");

        } else if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
            if (a > b)
                System.out.println("UCLN là:" + a);
            else
                System.out.println("UCLN là:" + b);
        } else {
            for (int i = 1; i < a + b; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    x = i;
                }
            }
            System.out.println("UCLN là:" + x);
        }
    }
}