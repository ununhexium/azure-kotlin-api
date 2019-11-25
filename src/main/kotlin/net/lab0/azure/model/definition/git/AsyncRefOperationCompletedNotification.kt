package net.lab0.azure.model.definition.git

import kotlin.String

interface AsyncRefOperationCompletedNotification : AsyncGitOperationNotification {
  val newRefName: String
}
