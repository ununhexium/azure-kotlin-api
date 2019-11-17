package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitConflictType
import net.lab0.azure.git.model.definition.enumeration.GitResolutionError
import net.lab0.azure.git.model.definition.enumeration.GitResolutionStatus

interface GitConflict {
  val _links: ReferenceLinks

  val conflictId: Int

  val conflictPath: String

  val conflictType: GitConflictType

  val mergeBaseCommit: GitCommitRef

  val mergeOrigin: GitMergeOriginRef

  val mergeSourceCommit: GitCommitRef

  val mergeTargetCommit: GitCommitRef

  val resolutionError: GitResolutionError

  val resolutionStatus: GitResolutionStatus

  val resolvedBy: IdentityRef

  val resolvedDate: String

  val url: String
}
