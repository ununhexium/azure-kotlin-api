package net.lab0.azure.model.definition.git

import javax.json.JsonNumber

interface AsyncRefOperationProgressNotification : AsyncRefOperationCommitLevelEventNotification {
  val progress: JsonNumber
}
