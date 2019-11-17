package net.lab0.azure.taskagent.model.definition

import kotlin.String

/**
 * Meta data for a metrics column.
 */
interface MetricsColumnMetaData {
  /**
   * Name.
   */
  val columnName: String

  /**
   * Data type.
   */
  val columnValueType: String
}
