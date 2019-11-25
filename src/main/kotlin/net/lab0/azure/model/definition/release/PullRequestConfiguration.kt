package net.lab0.azure.model.definition.release

import kotlin.Boolean

interface PullRequestConfiguration {
  val codeRepositoryReference: CodeRepositoryReference

  /**
   * In case of Source based artifacts, Code reference will be present in Artifact details.
   */
  val useArtifactReference: Boolean
}
