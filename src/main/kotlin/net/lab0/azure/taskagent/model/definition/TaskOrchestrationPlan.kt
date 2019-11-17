package net.lab0.azure.taskagent.model.definition

import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.TaskOrchestrationPlanState
import net.lab0.azure.taskagent.model.definition.enumeration.TaskResult

interface TaskOrchestrationPlan : TaskOrchestrationPlanReference {
  val environment: PlanEnvironment

  val finishTime: String

  val implementation: TaskOrchestrationContainer

  val initializationLog: TaskLogReference

  val requestedById: String

  val requestedForId: String

  val result: TaskResult

  val resultCode: String

  val startTime: String

  val state: TaskOrchestrationPlanState

  val timeline: TimelineReference
}
