package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int occurenceCounter = 0;
        int sizeCounter = 0;
        String[] holderArray = new String[array.length];
        for (String str : array) {
            occurenceCounter = 0;
            for (String str2 : array) {
                if (str.equals(str2)) {
                    occurenceCounter++;
                }
            }
            if (occurenceCounter < maxNumberOfDuplications) {
                holderArray[sizeCounter] = str;
                sizeCounter++;
            }
        }
        String[] resultArray = new String[sizeCounter];
        sizeCounter = 0;
        while (holderArray[sizeCounter] != null){
            resultArray[sizeCounter] = holderArray[sizeCounter];
            sizeCounter++;
        }

        return resultArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int occurenceCounter = 0;
        int sizeCounter = 0;
        String[] holderArray = new String[array.length];
        for (String str : array) {
            occurenceCounter = 0;
            for (String str2 : array) {
                if (str.equals(str2)) {
                    occurenceCounter++;
                }
            }
            if (occurenceCounter != exactNumberOfDuplications) {
                holderArray[sizeCounter] = str;
                sizeCounter++;
            }
        }
        String[] resultArray = new String[sizeCounter];
        sizeCounter = 0;
        while (holderArray[sizeCounter] != null){
            resultArray[sizeCounter] = holderArray[sizeCounter];
            sizeCounter++;
        }

        return resultArray;
    }
}
