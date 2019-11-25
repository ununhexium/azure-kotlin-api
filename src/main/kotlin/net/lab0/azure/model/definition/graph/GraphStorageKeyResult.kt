package net.lab0.azure.model.definition.graph

import kotlin.String

/**
 * Storage key of a Graph entity
 */
interface GraphStorageKeyResult {
  val _links: ReferenceLinks

  val value: String
}
