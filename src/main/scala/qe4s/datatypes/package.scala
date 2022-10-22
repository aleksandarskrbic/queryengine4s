package qe4s

import org.apache.arrow.vector.types.pojo.{ Schema => ArrowSchema }
import scala.jdk.CollectionConverters._

package object datatypes {
  implicit class SchemaConverter(arrowSchema: ArrowSchema) {
    def fromArrow: Schema =
      Schema(arrowSchema.getFields.asScala.map(field => Field(field.getName, field.getType)).toSeq)
  }
}
