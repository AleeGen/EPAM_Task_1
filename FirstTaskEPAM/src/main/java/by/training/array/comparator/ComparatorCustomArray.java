package by.training.array.comparator;

import by.training.array.entity.CustomArray;

import java.util.Comparator;

public enum ComparatorCustomArray implements Comparator<CustomArray> {
    ID {
        @Override
        public int compare(CustomArray o1, CustomArray o2) {
            return Long.compare(o1.getId(), o2.getId());
        }
    },
    AMOUNT {
        @Override
        public int compare(CustomArray o1, CustomArray o2) {
            long length1 = o1.getArray().length;
            long length2 = o2.getArray().length;
            return Long.compare(length1, length2);
        }
    },
    FIRST_ELEMENT {
        @Override
        public int compare(CustomArray o1, CustomArray o2) {
            long first1 = o1.getArray()[0];
            long first2 = o2.getArray()[0];
            return Long.compare(first1, first2);
        }
    };
}
