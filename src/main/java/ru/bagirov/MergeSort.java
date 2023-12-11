package ru.bagirov;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MergeSort {
}


class Merge<T extends Comparable<T>> {
    List<T> mergeLists(final List<T> firstList, final List<T> secondList) {
        final int firstListSize = firstList.size();
        final int secondListSize = secondList.size();
        List<T> mergedList = new ArrayList<T>(firstListSize+secondListSize);

        int iFirst = 0,
            iSecond = 0;
        while (iFirst < firstListSize && iSecond < secondListSize) {
            T currentFirstElement = firstList.get(iFirst);
            T currentSecondElement = secondList.get(iSecond);
            if (currentFirstElement.compareTo(currentSecondElement) < 0) {
                mergedList.add(currentFirstElement);
                iFirst++;
            } else {
                mergedList.add(currentSecondElement);
                iSecond++;
            }
        }
        while (iFirst < firstListSize || iSecond < secondListSize) {
            if (iFirst < firstListSize) {
                mergedList.add(firstList.get(iFirst));
                iFirst++;
            } else {
                mergedList.add(secondList.get(iSecond));
                iSecond++;
            }
        }
        return mergedList;
    }
}
