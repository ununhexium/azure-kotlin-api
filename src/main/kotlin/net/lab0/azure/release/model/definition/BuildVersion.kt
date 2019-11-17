package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.String

interface BuildVersion {
  val commitMessage: String

  val definitionId: String

  val definitionName: String

  val id: String

  val isMultiDefinitionType: Boolean

  val name: String

  val sourceBranch: String

  val sourcePullRequestVersion: SourcePullRequestVersion

  val sourceRepositoryId: String

  val sourceRepositoryType: String

  val sourceVersion: String
}
