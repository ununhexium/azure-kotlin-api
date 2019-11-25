package net.lab0.azure.model.definition.wiki

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Defines a page in a wiki.
 */
interface WikiPage : WikiPageCreateOrUpdateParameters {
  /**
   * Path of the git item corresponding to the wiki page stored in the backing Git repository.
   */
  val gitItemPath: String

  /**
   * True if a page is non-conforming, i.e. 1) if the name doesn't match page naming standards. 2)
   * if the page does not have a valid entry in the appropriate order file.
   */
  val isNonConformant: Boolean

  /**
   * True if this page has subpages under its path.
   */
  val isParentPage: Boolean

  /**
   * Order of the wiki page, relative to other pages in the same hierarchy level.
   */
  val order: Int

  /**
   * Path of the wiki page.
   */
  val path: String

  /**
   * Remote web url to the wiki page.
   */
  val remoteUrl: String

  /**
   * List of subpages of the current page.
   */
  val subPages: List<WikiPage>

  /**
   * REST url for this wiki page.
   */
  val url: String
}
