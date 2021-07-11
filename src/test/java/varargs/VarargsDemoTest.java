package varargs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarargsDemoTest {
    VarargsDemo varargsDemo = new VarargsDemo();

    @Test
    public void testOneArgs() {
        int sum = varargsDemo.sumVarargs(1);
        assertEquals(1, sum);
    }

    @Test
    public void Test3Args() {
        int sum = varargsDemo.sumVarargs(1, 4, 6);
        assertEquals(11, sum);
    }
}