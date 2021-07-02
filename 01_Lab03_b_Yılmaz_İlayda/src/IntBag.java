import java.util.*;

public class IntBag {

    int[] intBag;
    int m;


    public IntBag() {
        intBag = new int [4];
        intBag[0] = -1;
    }

    public void addEndValue( int value ){
        addIndexValue( value, numberOfValues() );
    }

    public void addIndexValue( int value, int index ){
        int numberOfValues = numberOfValues();

        if ( numberOfValues == intBag.length - 1 ){
            int length = intBag.length;
            int temp[] = new int [ length ];
            System.arraycopy( intBag,0, temp, 0, length);
            intBag = new int[ length * 2 ];
            System.arraycopy( temp,0, intBag, 0, length);
        }
        for (int i = numberOfValues - 1; i > index - 1; i--) {
            intBag[ i + 1 ] = intBag[ i ];
        }
        if ( index < intBag.length ) {
            this.intBag[ index ] = value;
        }
        if ( intBag[ numberOfValues ] != -1 ){
            this.intBag[ numberOfValues ] = -1;
        }
    }

    public void removeIndexValue( int index ){
        int length = intBag.length;
        this.intBag[ index ] = this.intBag[ length - 2];
        this.intBag[ length - 1] = this.intBag[ length - 2];

    }

    public boolean contains ( int value ){
        int x = 0;

        for ( int i : intBag ){
            if ( i == value ){
                x++;
            }
        }
        if ( x > 0){
            return true;
        }
        return false;
    }

    public int numberOfValues(){
        int c = 0 ;
        for ( int i = 0; i < intBag.length; i++ ){
            if ( intBag[i] >= 0 ){
                c++;
            }
        }
        return c;
    }

    public int getTheValue( int index ){
        int i = intBag[index];
        return i;
    }

    public String toString() {
        String arrayString = "";
        for (int i=0; i < numberOfValues(); i++) {
            arrayString = arrayString + intBag[i] + "\n";
        }
        return arrayString;
    }

    public void removeAll( int value ){
        for ( int i = 0; i < intBag.length; i++ ){
            if ( intBag[i] == value ){
                removeIndexValue(i);
            }
        }
    }

    public Iterator iterator( int m ){
        return new IntBagStepIterator( m, this );
    }

    public Iterator iterator(){
        return new IntBagIterator( this );
    }

}

