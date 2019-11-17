package net.lab0.azure.graph.model.definition

import kotlin.collections.List

/**
 * Batching of subjects to lookup using the Graph API
 */
interface GraphSubjectLookup {
  val lookupKeys: List<GraphSubjectLookupKey>
}
