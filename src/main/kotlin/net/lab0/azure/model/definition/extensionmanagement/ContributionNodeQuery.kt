package net.lab0.azure.model.definition.extensionmanagement

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ContributionQueryOptions

/**
 * A query that can be issued for contribution nodes
 */
interface ContributionNodeQuery {
  /**
   * The contribution ids of the nodes to find.
   */
  val contributionIds: List<String>

  val dataProviderContext: DataProviderContext

  /**
   * Indicator if contribution provider details should be included in the result.
   */
  val includeProviderDetails: Boolean

  /**
   * Query options tpo be used when fetching ContributionNodes
   */
  val queryOptions: ContributionQueryOptions
}
