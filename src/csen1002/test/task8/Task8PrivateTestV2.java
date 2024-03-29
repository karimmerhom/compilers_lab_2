package csen1002.test.task8;

import csen1002.main.task8.task8Lexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task8PrivateTestV2 {

    public static String tokenStream(String input){
        //In case Task8Lexer is not defined correctly:
        //1- If you modified the grammar in the g4 file, regenerate the ANTLR recognizer to make sure that the latest grammar is generated
        //2- Make sure that the location and the package are configured properly
        task8Lexer lexer = new task8Lexer(CharStreams.fromString(input));
        Vocabulary vocabulary = lexer.getVocabulary();
        List<? extends Token> tokens = lexer.getAllTokens();
        StringBuilder stringBuilder = new StringBuilder();
        for (Token token:tokens) {
            stringBuilder.append(token.getText()).append(",").append(vocabulary.getSymbolicName(token.getType())).append(";");
        }
        return stringBuilder.toString();
    }

    @Test
    public void testFDFA1T0() {assertEquals("11011000,Q3;", tokenStream("11011000"));}
    @Test
    public void testFDFA1T1() {
        assertEquals("00001001,Q4;", tokenStream("00001001"));	}
    @Test
    public void testFDFA1T2() {
        assertEquals("1001010,Q3;", tokenStream("1001010"));}
    @Test
    public void testFDFA1T3() {
        assertEquals("00000111000,Q3;", tokenStream("00000111000"));
    }
    @Test
    public void testFDFA1T4() {
        assertEquals("0011100000,Q3;001110,Q3;", tokenStream("0011100000001110"));	}
    @Test
    public void testFDFA1T5() {
        assertEquals("1001110,Q3;00101101,Q4;", tokenStream("100111000101101"));
    }
    @Test
    public void testFDFA1T6() {
        assertEquals("011100101011110,Q3;0010,Q3;", tokenStream("0111001010111100010"));	}
    @Test
    public void testFDFA1T7() {
        assertEquals("00010,Q3;0011,Q4;", tokenStream("000100011"));	}
    @Test
    public void testFDFA1T8() {
        assertEquals("100011000011,Q4;", tokenStream("100011000011"));
    }
    @Test
    public void testFDFA1T9() {
        assertEquals("00010111010,Q3;", tokenStream("00010111010"));
    }

}