package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] resultArray = new Integer[]{};
        int occurenceCounter = 0;
        int sizeCounter = 0;
        Integer[] holderArray = new Integer[array.length];
        for (Integer num : array) {
            occurenceCounter = 0;
            for (Integer num2 : array) {
                if (num.equals(num2)) {
                    occurenceCounter++;
                }
            }
            if (occurenceCounter < maxNumberOfDuplications) {
                holderArray[sizeCounter] = num;
                sizeCounter++;
            }
        }
        resultArray = new Integer[sizeCounter];
        sizeCounter = 0;
        while (holderArray[sizeCounter] != null){
            resultArray[sizeCounter] = holderArray[sizeCounter];
            sizeCounter++;
        }

        return resultArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int occurenceCounter = 0;
        int sizeCounter = 0;
        Integer[] holderArray = new Integer[array.length];
        for (Integer num : array) {
            occurenceCounter = 0;
            for (Integer num2 : array) {
                if (num.equals(num2)) {
                    occurenceCounter++;
                }
            }
            if (occurenceCounter != exactNumberOfDuplications) {
                holderArray[sizeCounter] = num;
                sizeCounter++;
            }
        }
        Integer[] resultArray = new Integer[sizeCounter];
        sizeCounter = 0;
        while (holderArray[sizeCounter] != null){
            resultArray[sizeCounter] = holderArray[sizeCounter];
            sizeCounter++;
        }

        return resultArray;
    }
}