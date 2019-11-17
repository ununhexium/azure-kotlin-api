package net.lab0.azure.git.model.definition

import javax.json.JsonNumber

interface AsyncRefOperationProgressNotification : AsyncRefOperationCommitLevelEventNotification {
  val progress: JsonNumber
}
