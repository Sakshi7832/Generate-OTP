import java.util.*;
class OTP {
  public static void main(String[] args) {
    int length;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the OTP = ");
    length = sc.nextInt();
    String numbers = "1234567890";
    char[] otp = new char[length];

    Random random = new Random();
    for(int i=1;i<length;i++)
      {
        otp[i] = numbers.charAt(random.nextInt(numbers.length()));
      }
    System.out.print("Your OTP is = ");
    System.out.print(otp);
  }
}
