package org.example.dataprocessor.analysis;

import java.util.Comparator;
import java.util.List;

public class MedianStrategy implements AnalysisInterface {
    @Override
    public double analysis(List<Integer> data) {
        if (data.isEmpty()||data==null){
            return Double.NaN;
        }
        data.sort(Comparator.naturalOrder());
        double middle1 = data.get((data.size()/2)-1);
        double middle2 = data.get(data.size()/2);
        if (data.size()%2==0){
            return (middle1+middle2)/2.0;
        }
        else
            return data.get(data.size()/2);
    }
}
