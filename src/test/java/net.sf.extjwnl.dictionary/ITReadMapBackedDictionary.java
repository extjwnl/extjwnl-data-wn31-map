package net.sf.extjwnl.dictionary;

import net.sf.extjwnl.JWNLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

/**
 * Creates a MapBackedDictionary and runs all the test cases.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class ITReadMapBackedDictionary extends DictionaryReadTester {

    @BeforeClass
    public static void initDictionary() throws IOException, JWNLException {
        dictionary = Dictionary.getDefaultResourceInstance();
    }

    @AfterClass
    public static void freeDictionary() {
        dictionary = null;
    }
}