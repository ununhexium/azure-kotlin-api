package net.lab0.azure.model.definition.work

import kotlin.Int
import kotlin.String

interface FilterClause {
  val fieldName: String

  val index: Int

  val logicalOperator: String

  val operator: String

  val value: String
}
