package net.lab0.azure.git.model.definition

import kotlin.String

interface GitCommit : GitCommitRef {
  val treeId: String
}
