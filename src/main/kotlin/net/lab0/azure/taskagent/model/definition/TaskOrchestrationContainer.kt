package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

interface TaskOrchestrationContainer : TaskOrchestrationItem {
  val children: List<TaskOrchestrationItem>

  val continueOnError: Boolean

  val data: JsonObject

  val maxConcurrency: Int

  val parallel: Boolean

  val rollback: TaskOrchestrationContainer
}
