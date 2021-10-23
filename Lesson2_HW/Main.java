package Lesson2_HW;

public class Main {
    public static void main (String[] args) {
        String[][] arr;
        arr = new String[][]{
                {"1", "5", "9", "13"},
                {"2", "6", "10", "14"},
                {"3", "7", "f", "15"},
                {"4", "8", "12", "16"}
        };
            try {
                int result = arrSum(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Массив превышает размеры 4х4");
            }
        catch (MyArrayDataException e) {
            System.out.println("Массив кривой, смотри ячейку: [" + e.i + "][" + e.j + "]");
        }
    }
    public static int arrSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
