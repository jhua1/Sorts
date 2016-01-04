import java.util.ArrayList;

public class MySorts{
        //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }

    //Checks if the given ArrayList is sorted.
    public static boolean isSorted( ArrayList<Comparable> list){
	boolean retbool = true;
	for ( int x = 0; x < list.size()-1; x++){
	    if ((data.get(x)).compareTo(data.get(x+1)) > 0)
		return false;
	}
	return retbool;
    }
	
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //=====================BUBBLESORT=====================

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) { 
	//int test = 0;
	for ( int pos = data.size() -1 ; pos > 0 ; pos--){
	    for ( int x = data.size()-1; x > 0 ; x--){
		if ( (data.get(x)).compareTo(data.get(x-1)) < 0){
		    data.set(x, data.set(x-1,data.get(x)));
		}		
	    }
	    //test += 1;
	    // System.out.println( test + " iteration result\n" + data.toString());
	}	    
    }//end bubbleSortV -- O(?)

    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
	ArrayList<Comparable> retlist = new ArrayList<Comparable>(input.size());
	for ( int x = 0; x < imput.size(); x++){
	    retlist.add(input.get(x));
	}
	bubbleSortV(retlist);
	return retlist;
    }//end bubbleSort -- O(?)

    //======================SELECTIONSORT======================

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ){
	for ( int pass = 0 ; pass < data.size() ; pass++ ){
	    int pos = pass;
	    Comparable com = data.get(pass);
	    for ( int x = pass+1; x < data.size() ; x++){
		if ( (data.get(x)).compareTo(com) < 0){
		    pos = x;
		    com = data.get(x);
		}
	    }
	    data.set( pass , data.set( pos, data.get(pass)));
	    // System.out.println(data);
	}
    }//end selectionSort -- O(?)


    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ){
	ArrayList<Comparable> retlist = new ArrayList<Comparable>(input.size());
	for ( int x = 0; x < input.size(); x++){
	    retlist.add(input.get(x));
	}
	selectionSortV(retlist);
	return retlist;
    }//end selectionSort -- O(?)

    //=========================BOGOSORT=========================

    public static void bogoSortV( ArrayList<Comparable> data){
	while( ! data.isSorted()){
	    data.shuffle();
	}
    }

    public static ArrayList<Comparable> bogoSort( ArrayList<Comparable> input){
	ArrayList<Comparable> retlist = new ArrayList<Comparable>(input.size());
	for ( int x = 0; x < input.size(); x++){
	    retlist.add(input.get(x));
	}
	bogoSortV(retlist);
	return retlist;
    }
}
	    
