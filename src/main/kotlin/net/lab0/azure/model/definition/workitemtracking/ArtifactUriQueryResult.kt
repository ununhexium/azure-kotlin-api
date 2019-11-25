package net.lab0.azure.model.definition.workitemtracking

import javax.json.JsonObject

/**
 * Defines result of artifact URI query on work items. Contains mapping of work item IDs to artifact
 * URI.
 */
interface ArtifactUriQueryResult {
  /**
   * A Dictionary that maps a list of work item references to the given list of artifact URI.
   */
  val artifactUrisQueryResult: JsonObject
}
