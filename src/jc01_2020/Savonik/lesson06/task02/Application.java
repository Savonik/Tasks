package jc01_2020.Savonik.lesson06.task02;


public class Application {
   public static void main(String[] args) {
      
      BancomatNEW bancomat = new BancomatNEW(4, 5, 1);
      System.out.println(bancomat.balance());
      bancomat.withdraw(90);
      System.out.println(bancomat.balance());
      bancomat.addMoney(3,5,1);
      System.out.println(bancomat.balance());
   }
}
