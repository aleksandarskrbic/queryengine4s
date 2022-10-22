package qe4s.datatypes

import org.apache.arrow.vector.types.pojo.ArrowType

final case class LiteralValueVector(size: Int, arrowType: ArrowType, value: Option[Any]) extends ColumnVector {
  override def getSize: Int = size

  override def getType: ArrowType = arrowType

  override def getValue(i: Int): Option[Any] = {
    if (i < 0 || i >= size) None
    else value
  }
}
