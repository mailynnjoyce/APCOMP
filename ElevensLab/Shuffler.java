import java.lang.Math;

public class Shuffler {

    private static final int SHUFFLE_COUNT = 5;
    private static final int VALUE_COUNT = 10;
	
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
        int[] valuesOne = new int[VALUE_COUNT];
        for (int i = 0; i < valuesOne.length; i++) {
            valuesOne[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(valuesOne);
            System.out.print("  " + j + ":");
            for (int k = 0; k < valuesOne.length; k++) {
                System.out.printf(" %2d", valuesOne[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] valuesTwo = new int[VALUE_COUNT];
        for (int i = 0; i < valuesTwo.length; i++) {
            valuesTwo[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(valuesTwo);
            System.out.print("  " + j + ":");
            for (int k = 0; k < valuesTwo.length; k++) {
                System.out.printf(" %2d", valuesTwo[k]);
            }
            System.out.println();
        }
        System.out.println();
    }
	
    public static void perfectShuffle(int[] values) 
	{
        int[] halfOne = new int[ VALUE_COUNT / 2 ];
        int[] halfTwo = new int[ VALUE_COUNT - VALUE_COUNT / 2 ];

        for( int i = 0; i < VALUE_COUNT / 2; i++ ) 
		{
            halfOne[i] = values[i];
        }
        
        for( int i = 0; i < VALUE_COUNT - VALUE_COUNT / 2; i++ ) 
		{
            halfTwo[i] = values[ i + VALUE_COUNT / 2 ];
        }

        for( int i = 0; i < VALUE_COUNT / 2; i++ ) 
		{
            values[ 2 * i ] = halfTwo[i];
            values[ 2 * i + 1 ] = halfOne[i];
        }

        if( VALUE_COUNT % 2 != 0 ) 
		{
            values[ VALUE_COUNT - 1 ] = halfTwo[ VALUE_COUNT - VALUE_COUNT / 2 ];
        }
    }

    public static void selectionShuffle(int[] values) 
	{
        for( int k = VALUE_COUNT - 1; k >= 0; k-- ) 
		{
            int r = (int)(Math.random() * k);
            int tmp = values[r];
            values[r] = values[k];
            values[k] = tmp;
        }
    }
}