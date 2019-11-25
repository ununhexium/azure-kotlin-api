package net.lab0.azure.model.definition.release

import kotlin.String

interface TaskOrchestrationPlanGroupReference {
  val planGroup: String

  val projectId: String
}
