package jc01_2020.Savonik.lesson06.task02;

public class Bancomat {
    int amount20;
    int amount50;
    int amount100;

    public Bancomat() {
    }

    public Bancomat(int amount20, int amount50, int amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    public int balance() {
        return amount20 * 20 + amount50 * 50 + amount100 * 100;
    }

    public void addMoney(int amount20, int amount50, int amount100) {
        this.amount20 += amount20;
        this.amount50 += amount50;
        this.amount100 += amount100;
    }

    
    
    public boolean withdraw(int amount) {
        if (amount > (amount20 * 20 + amount50 * 50 + amount100 * 100)) {
            System.out.println("введите меньшую сумму, в банкомате недостаточно денег");
            return false;
            
        } else if ((amount % 10) > 0 && amount<20) {
            System.out.println("банкомат выдает купюры только номиналом 20, 50, 100");
            return false;
        } 
        
        
        
        else {
            int am100 = 0;
            int am50 = 0;
            int am20 = 0;

            while ((amount >= 100) && (amount100 > 0)) {
                amount -= 100;
                amount100 -= 1;
                am100 += 1;
            }
            while ((amount >= 50) && (amount50 > 0)) {
                amount -= 50;
                amount50 -= 1;
                am50 += 1;
            }
            while ((amount >= 20) && (amount20 > 0)) {
                amount -= 20;
                amount20 -= 1;
                am20 += 1;
            }
            System.out.println("кол-во 100: " + am100 + "  кол-во 50:" + am50 + "  кол-во 20:" + am20);
            return true;
            
            
            
        }
        
        
      

    }

}
