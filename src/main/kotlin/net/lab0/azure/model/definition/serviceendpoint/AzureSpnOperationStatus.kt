package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface AzureSpnOperationStatus {
  val state: String

  val statusMessage: String
}
