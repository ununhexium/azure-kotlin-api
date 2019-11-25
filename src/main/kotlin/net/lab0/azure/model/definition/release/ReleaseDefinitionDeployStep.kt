package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface ReleaseDefinitionDeployStep : ReleaseDefinitionEnvironmentStep {
  /**
   * The list of steps for this definition.
   */
  val tasks: List<WorkflowTask>
}
