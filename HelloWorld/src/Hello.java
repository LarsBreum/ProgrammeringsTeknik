
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 double[][] m = {{7.5, -9.2, 12.5, 3.8}, 
                 {-2.0, 3.7, 9.0, 17.2},
                 {-20.0, 16.7, -4.1, 0.2,}};
		 double x = Double.MAX_VALUE;
		 int i = 0;
		 int k = 0;
		 for (int r = 0; r < m.length ; r++) {
		     for (int c = 0; c < m[r].length; c++) {
		         if (m[r][c] < x) {
		             x = m[r][c];
		             i = r;
		             k = c;
		         }
		     }
		 }
		 System.out.println(m[0][1]);
		
	}

}
