import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ojoj = new Scanner(System.in);
    while(true){
    System.out.println("Podaj Liczbe a");
    int x= ojoj.nextInt();
    System.out.println("Podaj Liczbe b");
      int y= ojoj.nextInt();
      int a = (int) Math.pow(x, y);
    int b = (int) Math.pow(y, x);
    System.out.println("Wynik: " + (a + b));

    }
  }
}