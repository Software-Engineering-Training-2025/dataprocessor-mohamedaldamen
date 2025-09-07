package org.example.dataprocessor.analysis;

import java.util.List;

public class MeanStrategy implements AnalysisInterface {
    @Override
    public double analysis(List<Integer> data) {
        if (data.isEmpty()||data==null){
            return Double.NaN;
        }
        double sum = 0.0;
        for(int i=0;i<data.size();i++){
            sum += data.get(i);
        }
        return sum/data.size();
    }
}