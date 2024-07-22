import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;
import operations.MyArrayCalc;


public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"99", "17", "25", "33"},
                {"5", "2", "15", "88"},
                {"2", "5", "ы", "41"},
                {"51", "28", "32", "0"}
        };

        MyArrayCalc manageArrays = new MyArrayCalc();
        try {
            int result = manageArrays.sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }
}