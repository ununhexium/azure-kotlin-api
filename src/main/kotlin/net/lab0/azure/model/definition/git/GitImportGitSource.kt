package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.String

/**
 * Parameter for creating a git import request when source is Git version control
 */
interface GitImportGitSource {
  /**
   * Tells if this is a sync request or not
   */
  val overwrite: Boolean

  /**
   * Url for the source repo
   */
  val url: String
}
