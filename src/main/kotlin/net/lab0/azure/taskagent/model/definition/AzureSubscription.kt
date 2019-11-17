package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AzureSubscription {
  val displayName: String

  val subscriptionId: String

  val subscriptionTenantId: String

  val subscriptionTenantName: String
}
