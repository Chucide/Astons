import operations.ManageNumb;
import operations.ManageArrays;
import operations.ManageStrings;

public class Main {
    public static void main(String[] args) {
        int allArrays = 20;
        final int eleArrayCount = 100;
        int fiveTaskFirst = 5, fiveTaskSecond = 11;
        int sixTaskNumber = 0;
        int sevenTaskNumber = -150;
        int eightTaskNumber = 10;
        String eightTaskWord = "ASTON";
        int nineTaskNumber = 1993;
        int[] arrayTen = {0, 1, 0, 1, 1, 0};
        int[] arrayEle = new int[eleArrayCount];
        int[] arrayTwe = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arraySizeFou = 13;
        int initialValueFou = 15;

        ManageStrings stringTasks = new ManageStrings();
        stringTasks.printThreeWords();
        ManageNumb numberTasks = new ManageNumb();
        numberTasks.checkSumSign();
        numberTasks.printColor();
        numberTasks.compareNumbers();
        numberTasks.workFiv(fiveTaskFirst, fiveTaskSecond);
        numberTasks.workSix(sixTaskNumber);
        numberTasks.workSev(sevenTaskNumber);
        stringTasks.workEig(eightTaskWord, eightTaskNumber);
        numberTasks.workNin(nineTaskNumber);
        ManageArrays arrayTasks = new ManageArrays();
        arrayTasks.workTen(arrayTen, allArrays);
        arrayTasks.workEle(arrayEle, allArrays);
        arrayTasks.workTwe(arrayTwe);
        arrayTasks.workThi();
        arrayTasks.workFou(arraySizeFou, initialValueFou);
    }
}

