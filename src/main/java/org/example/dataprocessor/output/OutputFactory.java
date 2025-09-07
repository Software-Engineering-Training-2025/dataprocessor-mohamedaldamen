package org.example.dataprocessor.output;

import org.example.dataprocessor.enums.OutputType;

public class OutputFactory {
    public static OutputInterface getOutputByType(OutputType outputType){
        if (outputType == OutputType.CONSOLE){
            return new Console();
        }
        if (outputType == OutputType.TEXT_FILE){
            return new TextFile();
        }
        throw new RuntimeException();
    }
}
