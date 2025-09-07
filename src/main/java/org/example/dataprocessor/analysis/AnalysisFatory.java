package org.example.dataprocessor.analysis;

import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFatory {
    public static AnalysisInterface getanalysis(AnalysisType analysisType){
        if (analysisType == AnalysisType.MEAN){
            return new MeanStrategy();
        }
        if (analysisType == AnalysisType.MEDIAN){
            return new MedianStrategy();
        }
        if (analysisType == AnalysisType.STD_DEV){
            return new StandardDeviationStrategy();
        }
        if (analysisType == AnalysisType.TOP3_FREQUENT_COUNT_SUM){
            return new Top3Frequant();
        }
        if (analysisType == AnalysisType.P90_NEAREST_RANK){
            return new NearestRankStrategy();
        }
        throw new RuntimeException();
    }
}
