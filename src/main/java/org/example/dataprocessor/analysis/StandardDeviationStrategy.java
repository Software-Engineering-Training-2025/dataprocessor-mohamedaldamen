package org.example.dataprocessor.analysis;

import java.util.List;

public class StandardDeviationStrategy implements AnalysisInterface {
    @Override
    public double analysis(List<Integer> data) {
        if (data.isEmpty()||data==null){
            return Double.NaN;
        }
        int n = data.size();
        double sum = 0.0;
        for (int number : data){
            sum += number;
        }
        double avg = sum / n ;
        double var = 0.0;
        for (int number : data){
            var += Math.pow(number-avg,2);
        }
        var = var/n;

        return Math.sqrt(var);
    }
}
