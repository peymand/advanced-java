package com.peyman.springboot.io.fileparser;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class ScannerStringUnitTest {

    protected static final String TEXT_FILENAME = "src/test/resources/sampleTextFile.txt";
    
    @Test
    public void whenParsingExistingTextFile_thenGetArrayList() throws IOException {
        List<String> lines = ScannerStringExample.generateArrayListFromFile(TEXT_FILENAME);
        assertTrue("File does not has 2 lines", lines.size() == 2);
    }
}
