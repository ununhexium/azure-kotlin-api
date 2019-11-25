package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface ApplicationType {
  val actionUriLink: String

  val autPortalLink: String

  val isEnabled: Boolean

  val maxComponentsAllowedForCollection: Int

  val maxCountersAllowed: Int

  val type: String
}
