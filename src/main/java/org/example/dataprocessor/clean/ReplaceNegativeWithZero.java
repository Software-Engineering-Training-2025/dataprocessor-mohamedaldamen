package org.example.dataprocessor.clean;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNegativeWithZero implements CleaningInterface {
    @Override
    public List<Integer> clean(List<Integer> data) {
        List<Integer> cleanedList = new ArrayList<>();
        for (Integer number : data) {
            if(number<0){
                cleanedList.add(0);
            }
            else
                cleanedList.add(number);
        }
        return cleanedList;
    }
}
