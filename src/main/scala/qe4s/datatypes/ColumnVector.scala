package qe4s.datatypes

import org.apache.arrow.vector.types.pojo.ArrowType

trait ColumnVector {
  def getSize: Int
  def getType: ArrowType
  def getValue(i: Int): Option[Any]
}
