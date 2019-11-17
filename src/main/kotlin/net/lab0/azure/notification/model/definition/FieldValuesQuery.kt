package net.lab0.azure.notification.model.definition

import kotlin.String
import kotlin.collections.List

interface FieldValuesQuery : InputValuesQuery {
  override val inputValues: List<FieldInputValues>

  val scope: String
}
