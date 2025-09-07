package org.example.dataprocessor.clean;

import org.example.dataprocessor.enums.CleaningType;

public class CleanFactory {
    public static CleaningInterface getCleanByType(CleaningType cleaningType){
        if(cleaningType == CleaningType.REMOVE_NEGATIVES){
            return new RemoveNegatives();
        }
        else if(cleaningType == CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            return new ReplaceNegativeWithZero();
        }
        throw new RuntimeException("Not supported");
    }
}
