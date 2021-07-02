import java.util.*;
public class IntBagIterator implements Iterator {

    private IntBag aBag;
    private int index;

    public IntBagIterator( IntBag aBag ) {
        this.aBag = aBag;
        index = 0;
    }

    public boolean hasNext() {
        if( index < aBag.numberOfValues() - 1 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public Integer next() {
        if( hasNext() ){
            index++;
            return aBag.getTheValue( index - 1 );
        }
        else {
            return null;
        }
    }

}
