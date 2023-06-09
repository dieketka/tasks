package Lesson10;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

class Main {

    /**
     * Средняя (3 балла)
     * <p>
     * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
     * Если список пуст, не делать ничего. Вернуть изменённый список.
     * <p>
     * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
     */
    public static double getAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        return stats.getAverage();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(15);
        numbers.add(26);
        numbers.add(16);
        ArrayList<Integer> centeredList = centerList(numbers);
        numbers.set(0, -2);
        numbers.set(1, 0);
        numbers.set(2, 3);
        numbers.set(3, 13);
        numbers.set(4, 3);


        double avg = getAverage(numbers); //Среднестатистическое число: 12
        System.out.println("Среднестатистическое число: " + avg);
        System.out.println(centeredList);

    }
    public static ArrayList<Integer> centerList(ArrayList<Integer> list) {
        int sum = 0;
        int size = list.size();
        for (int num : list) {
            sum += num;
        }

        return list;
    }
}