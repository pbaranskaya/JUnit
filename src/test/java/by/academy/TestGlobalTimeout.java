package by.academy;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TestGlobalTimeout {
    @Rule
    public final TestRule globalTimeout = Timeout.millis(20);

    @Test
    public void testInfinityLoop(){
        for(;;){

        }
    }

    @Test//
    public void testInfinityForLoop(){
        while (true) {
            return;
        }
    }
}
