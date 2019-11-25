package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface AzureSubscriptionQueryResult {
  val errorMessage: String

  val value: List<AzureSubscription>
}
