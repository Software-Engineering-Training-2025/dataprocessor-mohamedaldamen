package org.example.dataprocessor.analysis;

import java.util.Comparator;
import java.util.List;

public class NearestRankStrategy implements AnalysisInterface {
    @Override
    public double analysis(List<Integer> data) {
        if (data.isEmpty()||data==null){
            return Double.NaN;
        }
        data.sort(Comparator.naturalOrder());
        int n = data.size();
        int rank = (int) Math.ceil(0.90 * n);
        return data.get(rank-1);
    }
}
