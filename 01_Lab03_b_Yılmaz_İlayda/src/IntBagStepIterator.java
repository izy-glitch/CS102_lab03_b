import java.util.*;
public class IntBagStepIterator extends IntBagIterator {

    private int m ;
    private int index = 0;

    private IntBag bag;

    public IntBagStepIterator (int m, IntBag aBag){
        super(aBag);
        this.m = m;
        bag = aBag;
    }

    public boolean hasNext() {
        if( index < bag.numberOfValues() - 1 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public Integer next() {
        if ( hasNext() ) {
            index += m;
            return bag.getTheValue( index - m );
        }
        else{
            return null;
        }
    }
}
