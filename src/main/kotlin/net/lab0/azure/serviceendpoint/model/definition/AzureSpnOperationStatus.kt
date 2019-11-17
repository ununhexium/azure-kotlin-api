package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface AzureSpnOperationStatus {
  val state: String

  val statusMessage: String
}
