//Q1

public class matrices {
 public static void main(String[] args) {
		 int[][] mat1 = new int[][] { { 1, 20, 3, 10 }, { 7, 10, 9, 2 }, { 16, 10, 2, 14 }, { 1, 18, 26, 5 } };
		 int[][] mat2 = new int[][] { { 1, 16, 5, 82 }, { 19, 6, 17, 2 }, { 25, 6, 23, 3 }, { 30, 8, 17, 27 } };
		 int[][] mat3 = new int[][] { { 36, 25, 14, 4 }, { 16, 55, 4, 9 }, { 12, 6, 25, 3 }, { 1, 8, 13, 5 } };
		 int[][] mat4 = new int[][] { { 1, 14, 15, 4 }, { 7, 16, 14, 2 }, { 1, 11, 12, 3 }, { 1, 12, 23, 5 } };

  int count1, count2, count3, count4;


  count1 = multipleCounter(mat1);
  count2 = multipleCounter(mat2);
  count3 = multipleCounter(mat3);
  count4 = multipleCounter(mat4);

	 if (count1+count2+count3+count4>3){
		 System.out.println("there are atleast 4 values which are either multiple of 10 or 3 or 8 = " );
		 System.out.println("performing addition " );
		  int set1[][] =addMatricies(mat1,mat2);
		  int set2[][] =addMatricies(mat3,mat4);
		  int set3[][] =addMatricies(set1,set2);
		  printMe(set3);
	 }
	 else{


		 swapMatrix(mat1,mat3);
		 swapMatrix(mat2,mat4);
		 
		 System.out.println("Now first matrix one is" + "\t");
		 printMe(mat1);
		 System.out.println("Now second matrix one is" + "\t");
		 printMe(mat2);
		 System.out.println("Now third  matrix one is" + "\t");
		 printMe(mat1);
		 System.out.println("Now fourth matrix one is" + "\t");
		 printMe(mat2);

  
	 };
  


 }

 /** returns the multiples of 8 ,3 ,10 */
 public static int multipleCounter(int array[][]) {
  int counter = 0;
  for (int i = 0; i < 4; i++) {
   for (int j = 0; j < 4; j++) {
    if (array[i][j] % 3 == 0 || array[i][j] % 8 == 0 || array[i][j] % 10 == 0) {
     counter = counter + 1;

    }
   }
  }

  return counter;


 }

 /** Adds values of matrices*/

 static int[][] addMatricies(int[][] m1, int[][] m2) {


  int[][] result = new int[m1.length][m1[0].length];
  for (int row = 0; row < m1.length; row++) {
   for (int col = 0; col < m1[row].length; col++) {

    result[row][col] = m1[row][col] + m2[row][col];
   }
  }

  return result;
 }


 /** Printing array*/
 public static void printMe(int array[][]) {

  for (int i = 0; i < array.length; i++) {
   for (int j = 0; j < array[i].length; j++) {
    System.out.print(array[i][j] + "\t");
   }
   System.out.println();
  }
 }

/** Adds values of matrices*/

public static void swapMatrix(int[][] m1, int[][] m2) {

 
 int[][] result = new int[m1.length][m1[0].length];
 for (int row = 0; row < m1.length; row++) {
  for (int col = 0; col < m1[row].length; col++) {

   result[row][col] = m1[row][col];
   m1[row][col]=m2[row][col];
   m2[row][col]=result[row][col];
  }
 }


}
}