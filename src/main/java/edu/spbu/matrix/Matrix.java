package edu.spbu.matrix;

import java.util.Objects;


public interface Matrix
{

  Matrix mul(Matrix o);
  boolean equals(Object o);

  Matrix dmul(Matrix o);

}