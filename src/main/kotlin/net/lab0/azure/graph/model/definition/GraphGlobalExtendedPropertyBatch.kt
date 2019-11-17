package net.lab0.azure.graph.model.definition

import kotlin.String
import kotlin.collections.List

interface GraphGlobalExtendedPropertyBatch {
  val propertyNameFilters: List<String>

  val subjectDescriptors: List<String>
}
