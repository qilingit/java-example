package varargs;

public class VarargsDemo {
    public int sumVarargs(int... intArrays) {
        int sum = 0, i;
        for(i=0; i<intArrays.length; i++) {
            sum += intArrays[i];
        }
        return sum;
    }
}
