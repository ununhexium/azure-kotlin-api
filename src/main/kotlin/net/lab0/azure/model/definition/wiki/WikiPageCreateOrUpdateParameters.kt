package net.lab0.azure.model.definition.wiki

import kotlin.String

/**
 * Contract encapsulating parameters for the page create or update operations.
 */
interface WikiPageCreateOrUpdateParameters {
  /**
   * Content of the wiki page.
   */
  val content: String
}
