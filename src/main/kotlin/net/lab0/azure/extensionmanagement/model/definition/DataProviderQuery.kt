package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * A query that can be issued for data provider data
 */
interface DataProviderQuery {
  val context: DataProviderContext

  /**
   * The contribution ids of the data providers to resolve
   */
  val contributionIds: List<String>
}
