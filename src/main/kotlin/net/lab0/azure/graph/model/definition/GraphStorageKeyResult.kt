package net.lab0.azure.graph.model.definition

import kotlin.String

/**
 * Storage key of a Graph entity
 */
interface GraphStorageKeyResult {
  val _links: ReferenceLinks

  val value: String
}
