package net.lab0.azure.release.model.definition

import kotlin.String

interface TaskOrchestrationPlanGroupReference {
  val planGroup: String

  val projectId: String
}
