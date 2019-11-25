package net.lab0.azure.model.definition.graph

import kotlin.collections.List

/**
 * Batching of subjects to lookup using the Graph API
 */
interface GraphSubjectLookup {
  val lookupKeys: List<GraphSubjectLookupKey>
}
