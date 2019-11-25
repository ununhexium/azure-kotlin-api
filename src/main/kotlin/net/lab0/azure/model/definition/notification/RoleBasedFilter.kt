package net.lab0.azure.model.definition.notification

import kotlin.String
import kotlin.collections.List

interface RoleBasedFilter : ExpressionFilter {
  val exclusions: List<String>

  val inclusions: List<String>
}
