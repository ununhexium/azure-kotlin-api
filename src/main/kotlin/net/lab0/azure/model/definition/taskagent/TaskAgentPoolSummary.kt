package net.lab0.azure.model.definition.taskagent

import kotlin.collections.List

interface TaskAgentPoolSummary {
  val columnsHeader: MetricsColumnsHeader

  val deploymentGroups: List<DeploymentGroupReference>

  val pool: TaskAgentPoolReference

  val queues: List<TaskAgentQueue>

  val rows: List<MetricsRow>
}
