package net.lab0.azure.extensionmanagement.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.extensionmanagement.model.definition.enumeration.ContributionQueryOptions

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
