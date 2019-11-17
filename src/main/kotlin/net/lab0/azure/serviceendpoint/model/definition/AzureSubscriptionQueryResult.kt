package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String
import kotlin.collections.List

interface AzureSubscriptionQueryResult {
  val errorMessage: String

  val value: List<AzureSubscription>
}
