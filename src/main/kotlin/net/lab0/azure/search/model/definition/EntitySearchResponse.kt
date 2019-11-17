package net.lab0.azure.search.model.definition

import javax.json.JsonObject
import kotlin.Int

/**
 * Defines the base contract for search response.
 */
interface EntitySearchResponse {
  /**
   * A dictionary storing an array of <code>Filter</code> object against each facet.
   */
  val facets: JsonObject

  /**
   * Numeric code indicating any additional information: 0 - Ok, 1 - Account is being reindexed, 2 -
   * Account indexing has not started, 3 - Invalid Request, 4 - Prefix wildcard query not supported,
   * 5 - MultiWords with code facet not supported, 6 - Account is being onboarded, 7 - Account is being
   * onboarded or reindexed, 8 - Top value trimmed to maxresult allowed 9 - Branches are being indexed,
   * 10 - Faceting not enabled, 11 - Work items not accessible, 19 - Phrase queries with code type
   * filters not supported, 20 - Wildcard queries with code type filters not supported. Any other info
   * code is used for internal purpose.
   */
  val infoCode: Int
}
