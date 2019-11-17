package net.lab0.azure.git.model.definition

import kotlin.collections.List

interface GitQueryBranchStatsCriteria {
  val baseCommit: GitVersionDescriptor

  val targetCommits: List<GitVersionDescriptor>
}
