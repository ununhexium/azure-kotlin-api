package net.lab0.azure.model.definition.git

import kotlin.String

interface AsyncRefOperationCommitLevelEventNotification : AsyncGitOperationNotification {
  val commitId: String
}
