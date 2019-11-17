package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface TaskOrchestrationJob : TaskOrchestrationItem {
  val demands: List<Demand>

  val executeAs: IdentityRef

  val executionMode: String

  val executionTimeout: String

  val instanceId: String

  val name: String

  val refName: String

  val tasks: List<TaskInstance>

  val variables: JsonObject
}
