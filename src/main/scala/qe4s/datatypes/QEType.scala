package qe4s.datatypes

import org.apache.arrow.vector.types.pojo.ArrowType
import org.apache.arrow.vector.types.FloatingPointPrecision

sealed trait QEType

object QEType {
  final case class BooleanType(value: ArrowType.Bool = Defaults.BooleanType)        extends QEType
  final case class Int8Type(value: ArrowType.Int = Defaults.Int8Type)               extends QEType
  final case class Int16Type(value: ArrowType.Int = Defaults.Int16Type)             extends QEType
  final case class Int32Type(value: ArrowType.Int = Defaults.Int32Type)             extends QEType
  final case class Int64Type(value: ArrowType.Int = Defaults.Int64Type)             extends QEType
  final case class UInt8Type(value: ArrowType.Int = Defaults.UInt8Type)             extends QEType
  final case class UInt16Type(value: ArrowType.Int = Defaults.UInt16Type)           extends QEType
  final case class UInt32Type(value: ArrowType.Int = Defaults.UInt32Type)           extends QEType
  final case class UInt64Type(value: ArrowType.Int = Defaults.UInt64Type)           extends QEType
  final case class FloatType(value: ArrowType.FloatingPoint = Defaults.FloatType)   extends QEType
  final case class DoubleType(value: ArrowType.FloatingPoint = Defaults.DoubleType) extends QEType
  final case class StringType(value: ArrowType.Utf8 = Defaults.StringType)          extends QEType
}

private object Defaults {
  val BooleanType = new ArrowType.Bool()
  val Int8Type    = new ArrowType.Int(8, true)
  val Int16Type   = new ArrowType.Int(16, true)
  val Int32Type   = new ArrowType.Int(32, true)
  val Int64Type   = new ArrowType.Int(64, true)
  val UInt8Type   = new ArrowType.Int(8, false)
  val UInt16Type  = new ArrowType.Int(16, false)
  val UInt32Type  = new ArrowType.Int(32, false)
  val UInt64Type  = new ArrowType.Int(64, false)
  val FloatType   = new ArrowType.FloatingPoint(FloatingPointPrecision.SINGLE)
  val DoubleType  = new ArrowType.FloatingPoint(FloatingPointPrecision.DOUBLE)
  val StringType  = new ArrowType.Utf8()
}
