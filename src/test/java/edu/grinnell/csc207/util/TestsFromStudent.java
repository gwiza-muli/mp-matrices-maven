package edu.grinnell.csc207.util;

import static edu.grinnell.csc207.util.MatrixAssertions.assertMatrixEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


  /**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Sheilla Muligande
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
  } // alwaysPass()


    /**
   * A simple test.
   */
  @Test
  public void test01Get() throws Exception {
    Matrix<Integer> matr = new MatrixV0<Integer>(4, 3, 6);
    matr.set(2,3,5);
    assertEquals(5,matr.get(2,3), "checking if get works for ints.");
  } // alwaysPass()

  @Test
  public void test2set() throws Exception {
    Matrix<Integer> matr = new MatrixV0<Integer>(5, 6, 9);
    matr.set(3,2,11);
    assertEquals(11,matr.get(3,2), "checking if set works for ints.");
  }

  @Test
  public void test3height() throws Exception{
    Matrix<Integer> matr = new MatrixV0<Integer>(5, 6, 9);
    assertEquals(6, matr.height(), "testing height()");
  }

  @Test
  public void test4Width() throws Exception{
    Matrix<Integer> matr = new MatrixV0<Integer>(5, 6, 9);
    assertEquals(5, matr.width(), "testing height()");
  }

  @Test
  public void test5insertRow() throws Exception{
    Matrix<Integer> matr = new MatrixV0<Integer>(2, 3, 9);
    matr.insertRow(1);
    assertMatrixEquals(new Integer[][] {{9,9}, {9,9} , {9,9}, {9,9}} , matr, "checking insert row.");

  }

  @Test
  public void test6InsertRow2() throws Exception{
    Matrix<Integer> matr = new MatrixV0<Integer>(2, 3, 9);
    matr.insertRow(1, new Integer[] {2,2});
    assertMatrixEquals(new Integer[][] {{9,9}, {2,2} , {9,9}, {9,9}} , matr, "checking insert row.");
  }



}// class TestsFromStudent



// public T get()
//set()
//height
//width
// insertRow
// second insertRow
//insertCol
// second insertCol
// deleteRow
// deleteCol
//fillRegion
//fillLine
//clone
//equals
//