package operations;


public class ManageArrays {
    public void workTen(int[] arrayTen, int allArrays) {
        System.out.println("\nДесятое задание:");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void workEle(int[] arrayEle, int eleArrayCount) {
        System.out.println("\n\nОдинадцатое задание:");
        int[] oneArr = new int[100];
        for(int i = 0; i < oneArr.length; ++i) {
            oneArr[i] = i + 1;
            System.out.print(oneArr[i] + " ");
        }
        System.out.println();
    }
    public void workTwe(int[] arrayTwe) {
        System.out.println("\nДвенадцатое задание:");
        int[] tweArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < tweArray.length; ++i) {
            if (tweArray[i] < 6) {
                tweArray[i] *= 2;
            }
            System.out.print(tweArray[i] + " ");
        }
    }
    public void workThi() {
        System.out.println("\n\nТринадцатое задание:");
        int arraySize = 5;
        int[][] array = new int[arraySize][arraySize];

        for(int i = 0; i < arraySize; ++i) {
            for(int j = 0; j < arraySize; ++j) {
                if (i != j && arraySize - i != j + 1) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = array[i][arraySize - i - 1] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void workFou(int len, int initialValue) {
        System.out.println("\nЧетырнадцатое задание:");
        int[] array = new int[len];
        for(int i = 0; i < len; ++i) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
