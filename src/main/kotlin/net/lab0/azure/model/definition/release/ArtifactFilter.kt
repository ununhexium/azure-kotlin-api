package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface ArtifactFilter {
  val createReleaseOnBuildTagging: Boolean

  val sourceBranch: String

  val tags: List<String>

  val useBuildDefinitionBranch: Boolean
}
