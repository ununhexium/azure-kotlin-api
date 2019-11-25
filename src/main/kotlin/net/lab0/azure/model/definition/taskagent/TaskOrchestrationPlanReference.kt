package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

interface TaskOrchestrationPlanReference {
  val artifactLocation: String

  val artifactUri: String

  val definition: TaskOrchestrationOwner

  val owner: TaskOrchestrationOwner

  val planGroup: String

  val planId: String

  val planType: String

  val scopeIdentifier: String

  val version: Int
}
