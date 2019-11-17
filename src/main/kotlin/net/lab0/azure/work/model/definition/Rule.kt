package net.lab0.azure.work.model.definition

import kotlin.String
import kotlin.collections.List

interface Rule {
  val clauses: List<FilterClause>

  val filter: String

  val isEnabled: String

  val name: String

  val settings: Attribute
}
