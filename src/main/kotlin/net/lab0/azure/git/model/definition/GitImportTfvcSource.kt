package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Parameter for creating a git import request when source is tfvc version control
 */
interface GitImportTfvcSource {
  /**
   * Set true to import History, false otherwise
   */
  val importHistory: Boolean

  /**
   * Get history for last n days (max allowed value is 180 days)
   */
  val importHistoryDurationInDays: Int

  /**
   * Path which we want to import (this can be copied from Path Control in Explorer)
   */
  val path: String
}
