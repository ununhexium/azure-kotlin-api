package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface ReleaseDefinitionGate {
  val tasks: List<WorkflowTask>
}
