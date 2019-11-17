package net.lab0.azure.release.model.definition

import kotlin.String

interface ContinuousDeploymentTriggerIssue : AutoTriggerIssue {
  val artifactType: String

  val artifactVersionId: String

  val sourceId: String
}
