package structures;

public class Tuple<T,G> {
    T t;
    G g;
    
    public Tuple(T t, G g) {
        this.t = t;
        this.g = g;
    }
    
    public Object[] getValues() {
        Object[] tmp = new Object[2];
        tmp[0] = this.t;
        tmp[1] = this.g;
        return tmp;
    }
}