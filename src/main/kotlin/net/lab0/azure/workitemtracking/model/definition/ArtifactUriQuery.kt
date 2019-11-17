package net.lab0.azure.workitemtracking.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Contains criteria for querying work items based on artifact URI.
 */
interface ArtifactUriQuery {
  /**
   * List of artifact URIs to use for querying work items.
   */
  val artifactUris: List<String>
}
