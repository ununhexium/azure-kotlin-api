package net.lab0.azure.git.model.definition

import kotlin.String

interface AsyncRefOperationCommitLevelEventNotification : AsyncGitOperationNotification {
  val commitId: String
}
