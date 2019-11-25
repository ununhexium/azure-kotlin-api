package net.lab0.azure.model.definition.graph

import kotlin.String

/**
 * Subject descriptor of a Graph entity
 */
interface GraphDescriptorResult {
  val _links: ReferenceLinks

  val value: String
}
