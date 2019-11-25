package net.lab0.azure.model.definition.release

import net.lab0.azure.model.definition.enumeration.release.IssueSource
import net.lab0.azure.model.definition.enumeration.release.ReleaseTriggerType

interface AutoTriggerIssue {
  val issue: Issue

  val issueSource: IssueSource

  val project: ProjectReference

  val releaseDefinitionReference: ReleaseDefinitionShallowReference

  val releaseTriggerType: ReleaseTriggerType
}
