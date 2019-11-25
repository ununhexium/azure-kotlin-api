package net.lab0.azure.model.definition.notification

import kotlin.String
import kotlin.collections.List

interface FieldValuesQuery : InputValuesQuery {
  override val inputValues: List<FieldInputValues>

  val scope: String
}
