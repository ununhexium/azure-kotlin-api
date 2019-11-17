package net.lab0.azure.notification.model.definition

import kotlin.String
import kotlin.collections.List

interface FieldInputValues : InputValues {
  val operators: List<String>
}
