package net.lab0.azure.model.definition.search

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Defines the code result containing information of the searched files and its metadata.
 */
interface CodeResult {
  val collection: Collection

  /**
   * ContentId of the result file.
   */
  val contentId: String

  /**
   * Name of the result file.
   */
  val fileName: String

  /**
   * Dictionary of field to hit offsets in the result file. Key identifies the area in which hits
   * were found, for ex: file content/file name etc.
   */
  val matches: JsonObject

  /**
   * Path at which result file is present.
   */
  val path: String

  val project: Project

  val repository: Repository

  /**
   * Versions of the result file.
   */
  val versions: List<Version>
}
