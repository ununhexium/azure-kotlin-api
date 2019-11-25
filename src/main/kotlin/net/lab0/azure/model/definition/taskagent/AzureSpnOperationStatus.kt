package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AzureSpnOperationStatus {
  val state: String

  val statusMessage: String
}
