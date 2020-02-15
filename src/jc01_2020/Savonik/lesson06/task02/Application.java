package jc01_2020.Savonik.lesson06.task02;


public class Application {
   public static void main(String[] args) {
      
      Bancomat bancomat1 = new Bancomat(1, 1, 1);
      System.out.println(bancomat1.balance());
      bancomat1.addMoney(2,5,6);
      System.out.println(bancomat1.balance());
      bancomat1.addMoney(2,5,6);
      System.out.println(bancomat1.balance());
      bancomat1.withdraw(50);
      System.out.println(bancomat1.balance());
   }
}
