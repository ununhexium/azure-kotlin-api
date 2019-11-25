package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

/**
 * Metrics row.
 */
interface MetricsRow {
  /**
   * The values of the properties mentioned as 'Dimensions' in column header. E.g. 1: For a property
   * 'LastJobStatus' - metrics will be provided for 'passed', 'failed', etc. E.g. 2: For a property
   * 'TargetState' - metrics will be provided for 'online', 'offline' targets.
   */
  val dimensions: List<String>

  /**
   * Metrics in serialized format. Should be deserialized based on the data type provided in header.
   */
  val metrics: List<String>
}
