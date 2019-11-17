package net.lab0.azure.taskagent.model.definition

import kotlin.collections.List

/**
 * Metrics columns header
 */
interface MetricsColumnsHeader {
  /**
   * Properties of deployment group for which metrics are provided. E.g. 1: LastJobStatus E.g. 2:
   * TargetState
   */
  val dimensions: List<MetricsColumnMetaData>

  /**
   * The types of metrics. E.g. 1: total count of deployment targets. E.g. 2: Average time of
   * deployment to the deployment targets.
   */
  val metrics: List<MetricsColumnMetaData>
}
