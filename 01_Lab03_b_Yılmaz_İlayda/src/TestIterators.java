import java.util.*;
public class TestIterators {

    public static void main( String[] args) {
        IntBag bag = new IntBag();

        //  … insert some elements
        for ( int x = 1; x < 10; x++ ){
            bag.addEndValue( x );

        }

        Iterator i, j;
        i = bag.iterator();
        while ( i.hasNext() )
        {
            System.out.println( i.next() );
            j = bag.iterator();
            while ( j.hasNext() )
            {
                System.out.println( "--" + j.next() );
            }
        }
    }
}
