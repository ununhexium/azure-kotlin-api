package net.lab0.azure.git.model.definition

import kotlin.String

interface AsyncRefOperationCompletedNotification : AsyncGitOperationNotification {
  val newRefName: String
}
