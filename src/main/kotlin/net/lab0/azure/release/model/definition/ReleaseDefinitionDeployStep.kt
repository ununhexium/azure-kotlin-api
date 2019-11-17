package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface ReleaseDefinitionDeployStep : ReleaseDefinitionEnvironmentStep {
  /**
   * The list of steps for this definition.
   */
  val tasks: List<WorkflowTask>
}
