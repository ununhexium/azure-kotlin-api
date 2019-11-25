package net.lab0.azure.model.definition.git

import kotlin.String

interface GitCommit : GitCommitRef {
  val treeId: String
}
