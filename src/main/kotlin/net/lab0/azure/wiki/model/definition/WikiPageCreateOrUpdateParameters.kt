package net.lab0.azure.wiki.model.definition

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
