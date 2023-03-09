import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ojoj = new Scanner(System.in);
    while(true){
    System.out.println("Podaj Liczbe a");
    int a = ojoj.nextInt();
    System.out.println("Podaj Liczbe b");
    int b = ojoj.nextInt();
    System.out.println("Wynik: " + (a + b));

    }
  }
}