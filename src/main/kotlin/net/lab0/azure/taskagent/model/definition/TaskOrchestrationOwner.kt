package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface TaskOrchestrationOwner {
  val _links: ReferenceLinks

  val id: Int

  val name: String
}
