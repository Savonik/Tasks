package jc01_2020.Savonik.lesson06.task02;


import java.util.HashMap;
import java.util.Map;

public class BancomatNEW {
    static int amount20;
    static int amount50;
    static int amount100;
    static int a20 = 0;
    static int a50 = 0;
    static int a100 = 0;
    static Map<Integer, Integer> mapik = new HashMap<>();

    public BancomatNEW() {
    }

    public BancomatNEW(int amount20, int amount50, int amount100) {
        BancomatNEW.amount20 = amount20;
        BancomatNEW.amount50 = amount50;
        BancomatNEW.amount100 = amount100;
    }

    public int balance() {
        return amount20 * 20 + amount50 * 50 + amount100 * 100;
    }

    public void addMoney(int amount20, int amount50, int amount100) {
        BancomatNEW.amount20 += amount20;
        BancomatNEW.amount50 += amount50;
        BancomatNEW.amount100 += amount100;
    }

    public boolean withdraw(int amount) {
        int count = 0;
        int count1 = 0;

        if (amount > (amount20 * 20 + amount50 * 50 + amount100 * 100)) {
            System.out.println("введите меньшую сумму, в банкомате недостаточно денег");
            return false;
        }

        if ((amount % 10) > 0 && amount < 20) {
            System.out.println("банкомат выдает купюры только номиналом 20, 50, 100");
            return false;
        } else {
            for (int i = 1; i <= amount100; i++) {
                mapik.put(i, 100);
            }
            for (int i = amount100 + 1; i <= amount100 + amount50; i++) {
                mapik.put(i, 50);
            }
            for (int i = amount100 + amount50 + 1; i <= amount100 + amount50 + amount20; i++) {
                mapik.put(i, 20);
            }

            for (int i = 1; i <= amount100 + amount50 + amount20; i++) {
                if (amount == mapik.get(i) && i == amount100 + amount50 + amount20) {
                    printAmount();
                    return true;
                } else {
                    if (amount - mapik.get(i) < 0 || (amount - mapik.get(i) == 30)) {
                        mapik.remove(i);
                    } else {
                        if (amount == mapik.get(i)) {
                            for (int k = i + 1; k <= amount100 + amount50 + amount20; k++) {
                                mapik.put(k, 0);
                            }
                        }
                        for (int j = i + 1; j <= amount100 + amount50 + amount20; j++) {
                            if (amount - mapik.get(i) - mapik.get(j) < 0) {
                                count++;
                            }
                            count1++;
                        }
                        if (count == count1) {
                            mapik.remove(i);
                        } else {
                            amount -= mapik.get(i);
                        }
                        count1 = 0;
                        count = 0;
                    }
                }
            }
            if (amount == 0) {
                printAmount();
            }
            System.out.println(amount == 0);
            return amount == 0;
        }
    }

    public static void printAmount() {
        for (Map.Entry<Integer, Integer> entry : mapik.entrySet()) {
            if (entry.getValue().equals(20)) {
                a20++;
                amount20--;
            }
            if (entry.getValue().equals(50)) {
                a50++;
                amount50--;
            }
            if (entry.getValue().equals(100)) {
                a100++;
                amount100--;
            }
        }
        System.out.println("количество 100: " + a100 + ", количество 50: " + a50 + ", количество 20: " + a20);
    }
}

