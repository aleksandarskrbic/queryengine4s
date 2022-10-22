package qe4s.datasource

import qe4s.datatypes.{ RecordBatch, Schema }

trait DataSource {
  def schema: Schema

  // Select specified columns
  def scan(projection: Seq[String]): Seq[RecordBatch]
}
