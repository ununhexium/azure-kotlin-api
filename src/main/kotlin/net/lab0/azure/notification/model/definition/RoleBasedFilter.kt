package net.lab0.azure.notification.model.definition

import kotlin.String
import kotlin.collections.List

interface RoleBasedFilter : ExpressionFilter {
  val exclusions: List<String>

  val inclusions: List<String>
}
