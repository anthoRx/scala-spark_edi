package io.github.anthorx

import org.apache.spark.sql.SparkSession

object RunApp extends App {

  val sparkSession = SparkSession
    .builder()
    .appName("Test")
    .master("local[*]")
    .getOrCreate()

  import sparkSession.implicits._

  Seq("bob", "jean", "mich").toDF().show()
}
