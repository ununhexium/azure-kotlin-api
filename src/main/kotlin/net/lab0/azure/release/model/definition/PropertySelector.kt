package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.PropertySelectorType

interface PropertySelector {
  val properties: List<String>

  val selectorType: PropertySelectorType
}
