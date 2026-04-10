package com.yuehua.algorithm.quickSort;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSortDemo {
    public static void main(String[] args) {
//        System.out.println(sum(new int[]{1, 2, 3, 4}));

        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
    }

    private static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }


    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() <= 1){
            return list;
        }
        Integer pivot = list.get(0);
        List<Integer> less = list.stream().skip(1).filter(el -> el <= pivot)
                .toList();
        List<Integer> greater = list.stream().skip(1).filter(el -> el > pivot)
                .toList();
        return Stream.of(
                        quicksort(less).stream(),
                        Stream.of(pivot),
                        quicksort(greater).stream())
                .flatMap(Function.identity()).collect(Collectors.toList());
    }
}
