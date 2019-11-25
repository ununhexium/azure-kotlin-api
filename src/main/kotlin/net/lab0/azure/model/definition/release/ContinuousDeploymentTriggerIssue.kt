package net.lab0.azure.model.definition.release

import kotlin.String

interface ContinuousDeploymentTriggerIssue : AutoTriggerIssue {
  val artifactType: String

  val artifactVersionId: String

  val sourceId: String
}
