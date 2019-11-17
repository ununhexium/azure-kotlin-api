package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface ReleaseDefinitionGate {
  val tasks: List<WorkflowTask>
}
