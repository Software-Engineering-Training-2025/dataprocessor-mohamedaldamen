package org.example.dataprocessor.output;

import java.io.IOException;

public class Console implements OutputInterface{
    @Override
    public void output(double Result) throws IOException {
        System.out.print(Result);
    }
}
