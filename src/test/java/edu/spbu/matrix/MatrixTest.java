package edu.spbu.matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTest
{
  /**
   * ожидается 4 таких теста
   */
  @Test
  public void mulDD() {
    Matrix m1 = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m1.txt");
    Matrix m2 = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m2.txt");
    Matrix expected = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\result.txt");
    assertEquals(expected, m1.mul(m2));
  }

  @Test
  public void mulDS() {
    Matrix m1 = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m1.txt");
    Matrix m2 = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m2.txt");
    Matrix expected = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\result.txt");
    assertEquals(expected, m1.mul(m2));
  }

  @Test
  public void mulSD() {
    Matrix m1 = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m1.txt");
    Matrix m2 = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m2.txt");
    Matrix expected = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\result.txt");
    assertEquals(expected, m1.mul(m2));
  }

  @Test
  public void mulSS() {
    Matrix m1 = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m1.txt");
    Matrix m2 = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m2.txt");
    Matrix expected = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\result.txt");
    assertEquals(expected, m1.mul(m2));
  }

  @Test
  public void dmulDD() {
    Matrix m1 = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m1.txt");
    Matrix m2 = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m2.txt");
    Matrix expected = new DenseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\result.txt");
    //Matrix mres = m1.dmul((m2));
    //mres.print();
   //expected.print();
    assertEquals(expected, m1.dmul(m2));
  }

  @Test
  public void dmulSS() {
    Matrix m1 = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m1.txt");
    Matrix m2 = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\m2.txt");
    Matrix expected = new SparseMatrix("C:\\Users\\наревсм\\Documents\\java-template\\src\\test\\java\\edu\\spbu\\matrix\\result.txt");
    Matrix m3 = m1.dmul(m2);
    assertEquals(expected, m3);
  }
}
