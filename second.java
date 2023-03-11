package hw_java2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class second {
    public static void main(String[] args) throws SecurityException, IOException {

        //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

        Logger logger = Logger.getLogger(second.class.getName());
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        int[] arr = {1, 4, 3, 2, 5, 6, 8, 21, 56, 23, 18};

        try {
            for (int i = 0; i < arr.length - 1; i++) {
                int minP = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if ((arr[j]) < (arr[minP])) minP = j;
                }
                int temp = arr[i];
                arr[i] = arr[minP];
                arr[minP] = temp;
            }
            logger.log(Level.INFO, "Everythig is fine");
        } catch (Exception e) {
            logger.log(Level.WARNING, "!!!");
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
