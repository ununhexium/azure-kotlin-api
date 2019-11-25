package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.PropertySelectorType

interface PropertySelector {
  val properties: List<String>

  val selectorType: PropertySelectorType
}
