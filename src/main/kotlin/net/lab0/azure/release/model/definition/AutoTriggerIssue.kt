package net.lab0.azure.release.model.definition

import net.lab0.azure.release.model.definition.enumeration.IssueSource
import net.lab0.azure.release.model.definition.enumeration.ReleaseTriggerType

interface AutoTriggerIssue {
  val issue: Issue

  val issueSource: IssueSource

  val project: ProjectReference

  val releaseDefinitionReference: ReleaseDefinitionShallowReference

  val releaseTriggerType: ReleaseTriggerType
}
