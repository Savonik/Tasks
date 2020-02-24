package jc01_2020.Savonik.lesson06.task02;


public class Application {
   public static void main(String[] args) {
      
      Bancomat bancomat = new Bancomat(1, 1, 1);
      System.out.println(bancomat.balance());
      bancomat.addMoney(2,5,6);
      System.out.println(bancomat.balance());
      bancomat.addMoney(2,5,6);
      System.out.println(bancomat.balance());
      bancomat.withdraw(50);
      System.out.println(bancomat.balance());
   }
}
