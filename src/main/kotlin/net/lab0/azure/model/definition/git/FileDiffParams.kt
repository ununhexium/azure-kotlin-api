package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Provides parameters that describe inputs for the file diff
 */
interface FileDiffParams {
  /**
   * Original path of the file
   */
  val originalPath: String

  /**
   * Current path of the file
   */
  val path: String
}
