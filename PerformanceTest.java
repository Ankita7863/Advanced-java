//* Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending 
//*the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.


package lab2b_exercise;

public class PerformanceTest {

	public static void main(String[] args) {
		// -------- StringBuffer --------
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuffer.append("AIET");
        }

        long endTimeBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTimeBuffer - startTimeBuffer) + " ms");

        // -------- StringBuilder --------
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuilder.append("AIET");
        }

        long endTimeBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTimeBuilder - startTimeBuilder) + " ms");
    }
}
