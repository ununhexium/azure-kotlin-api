package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitConflictType
import net.lab0.azure.model.definition.enumeration.git.GitResolutionError
import net.lab0.azure.model.definition.enumeration.git.GitResolutionStatus

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
