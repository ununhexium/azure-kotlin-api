package net.lab0.azure.model.definition.test

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

/**
 * Represents Test Log Result object.
 */
interface TestLog {
  val logReference: TestLogReference

  val metaData: JsonObject

  /**
   * LastUpdatedDate for Log file
   */
  val modifiedOn: String

  /**
   * Size in Bytes for Log file
   */
  val size: Int
}
