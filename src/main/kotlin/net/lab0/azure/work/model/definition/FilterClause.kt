package net.lab0.azure.work.model.definition

import kotlin.Int
import kotlin.String

interface FilterClause {
  val fieldName: String

  val index: Int

  val logicalOperator: String

  val operator: String

  val value: String
}
