package qe4s.datatypes

import org.apache.arrow.vector.types.FloatingPointPrecision
import org.apache.arrow.vector.types.pojo.{ ArrowType => JArrowType }

sealed trait ArrowType

object ArrowType {
  final case class BooleanType(value: JArrowType.Bool = Defaults.BooleanType)        extends ArrowType
  final case class Int8Type(value: JArrowType.Int = Defaults.Int8Type)               extends ArrowType
  final case class Int16Type(value: JArrowType.Int = Defaults.Int16Type)             extends ArrowType
  final case class Int32Type(value: JArrowType.Int = Defaults.Int32Type)             extends ArrowType
  final case class Int64Type(value: JArrowType.Int = Defaults.Int64Type)             extends ArrowType
  final case class UInt8Type(value: JArrowType.Int = Defaults.UInt8Type)             extends ArrowType
  final case class UInt16Type(value: JArrowType.Int = Defaults.UInt16Type)           extends ArrowType
  final case class UInt32Type(value: JArrowType.Int = Defaults.UInt32Type)           extends ArrowType
  final case class UInt64Type(value: JArrowType.Int = Defaults.UInt64Type)           extends ArrowType
  final case class FloatType(value: JArrowType.FloatingPoint = Defaults.FloatType)   extends ArrowType
  final case class DoubleType(value: JArrowType.FloatingPoint = Defaults.DoubleType) extends ArrowType
  final case class StringType(value: JArrowType.Utf8 = Defaults.StringType)          extends ArrowType
}

private object Defaults {
  val BooleanType = new JArrowType.Bool()
  val Int8Type    = new JArrowType.Int(8, true)
  val Int16Type   = new JArrowType.Int(16, true)
  val Int32Type   = new JArrowType.Int(32, true)
  val Int64Type   = new JArrowType.Int(64, true)
  val UInt8Type   = new JArrowType.Int(8, false)
  val UInt16Type  = new JArrowType.Int(16, false)
  val UInt32Type  = new JArrowType.Int(32, false)
  val UInt64Type  = new JArrowType.Int(64, false)
  val FloatType   = new JArrowType.FloatingPoint(FloatingPointPrecision.SINGLE)
  val DoubleType  = new JArrowType.FloatingPoint(FloatingPointPrecision.DOUBLE)
  val StringType  = new JArrowType.Utf8()
}
