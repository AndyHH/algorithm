package com.yuehua.algorithm.selectionSort;

import java.util.ArrayList;
import java.util.List;

/**
 * 选择排序
 */
public class SelectionSortDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 4, 2, 1, 9, 8));
        List<Integer> res = selectionSort(list);
        System.out.println(res.toString());
    }

    private static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> newArr = new ArrayList<>();
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int minIndex = 0;
            Integer min = list.get(0);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            newArr.add(min);
            list.remove(minIndex);
        }
        return newArr;
    }


}
