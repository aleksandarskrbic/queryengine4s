package qe4s.datatypes

import org.apache.arrow.vector.types.pojo.{ ArrowType, FieldType, Field => ArrowField, Schema => ArrowSchema }
import scala.jdk.CollectionConverters._

object Schema {}

final case class Schema(fields: Seq[Field]) {
  def toArrow: ArrowSchema =
    new ArrowSchema(fields.map(_.toArrow).asJava)

  def project(indices: Seq[Int]): Schema =
    Schema(indices.map(fields(_)))

  def select(names: Seq[String]): Schema = {
    val selectedFields = names
      .foldLeft(List.empty[Option[Field]]) { (state, name) =>
        state :+ fields.find(_.name == name)
      }
      .flatten

    Schema(selectedFields)
  }

}

final case class Field(name: String, dataType: ArrowType) {
  def toArrow: ArrowField = {
    val fieldType = new FieldType(true, dataType, null)
    new ArrowField(name, fieldType, Seq.empty[ArrowField].asJava)
  }
}
