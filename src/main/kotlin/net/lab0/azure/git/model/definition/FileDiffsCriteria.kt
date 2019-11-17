package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Provides properties that describe inputs for the file diffs
 */
interface FileDiffsCriteria {
  /**
   * Commit ID of the base version
   */
  val baseVersionCommit: String

  /**
   * List of parameters for each of the files for which we need to get the file diff
   */
  val fileDiffParams: List<FileDiffParams>

  /**
   * Commit ID of the target version
   */
  val targetVersionCommit: String
}
