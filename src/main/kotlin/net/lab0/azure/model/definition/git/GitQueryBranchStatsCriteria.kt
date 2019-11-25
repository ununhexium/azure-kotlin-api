package net.lab0.azure.model.definition.git

import kotlin.collections.List

interface GitQueryBranchStatsCriteria {
  val baseCommit: GitVersionDescriptor

  val targetCommits: List<GitVersionDescriptor>
}
