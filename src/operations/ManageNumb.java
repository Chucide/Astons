package operations;


public class ManageNumb {
    public void checkSumSign() {
        System.out.println("\nВторое задание:");
        int a = 3; int b = 9;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }
    public void printColor() {
        System.out.println("\nТретье задание:");
        int value = 70;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.print("Зеленый");
        }
    }
    public void compareNumbers() {
        System.out.println("\nЧетвёртое задание:");
        int a = 1; int b = 50;
        if (a >= b) {
            System.out.print("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public void workFiv(int a, int b) {
        System.out.println("\nПятое задание:");
        int sum = a + b;
        System.out.println(sum >= 10 && sum <= 20);
    }
    public void workSix(int a) {
        System.out.println("\nШестое задание:");
        System.out.println(a >= 0 ? "Положительное число" : "Отрицательное число");
    }
    public void workSev(int a) {
        System.out.println("\nСедьмое задание:");
        System.out.println(a < 0);
    }
    public void workNin(int year) {
        System.out.println("\n\nДевятое задание:");
        boolean verYear = false;
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            verYear = true;
        }
        System.out.println(verYear);
    }

}
