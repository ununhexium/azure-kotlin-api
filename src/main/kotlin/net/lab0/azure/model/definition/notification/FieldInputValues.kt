package net.lab0.azure.model.definition.notification

import kotlin.String
import kotlin.collections.List

interface FieldInputValues : InputValues {
  val operators: List<String>
}
