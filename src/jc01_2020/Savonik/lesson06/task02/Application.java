package jc01_2020.Savonik.lesson06.task02;


public class Application {
   public static void main(String[] args) {
      
      BancomatNEW bancomat = new BancomatNEW(3, 5, 1);
      System.out.println(bancomat.balance());
      bancomat.withdraw1(60);
      System.out.println(bancomat.balance());
   }
}
