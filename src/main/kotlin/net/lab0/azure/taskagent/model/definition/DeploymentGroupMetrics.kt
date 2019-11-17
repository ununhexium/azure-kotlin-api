package net.lab0.azure.taskagent.model.definition

import kotlin.collections.List

/**
 * Deployment group metrics.
 */
interface DeploymentGroupMetrics {
  val columnsHeader: MetricsColumnsHeader

  val deploymentGroup: DeploymentGroupReference

  /**
   * Values of properties and the metrics. E.g. 1: total count of deployment targets for which
   * 'TargetState' is 'offline'. E.g. 2: Average time of deployment to the deployment targets for which
   * 'LastJobStatus' is 'passed' and 'TargetState' is 'online'.
   */
  val rows: List<MetricsRow>
}
