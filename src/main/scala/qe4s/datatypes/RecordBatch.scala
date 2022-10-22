package qe4s.datatypes

final case class RecordBatch(schema: Schema, fields: Seq[ColumnVector]) {
  def rowCount: Int = fields.head.getSize

  def columnCount: Int = fields.size

  def field(i: Int): ColumnVector = fields(i)
}
