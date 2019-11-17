package net.lab0.azure.git.model.definition

import kotlin.String

/**
 * Status context that uniquely identifies the status.
 */
interface GitStatusContext {
  /**
   * Genre of the status. Typically name of the service/tool generating the status, can be empty.
   */
  val genre: String

  /**
   * Name identifier of the status, cannot be null or empty.
   */
  val name: String
}
