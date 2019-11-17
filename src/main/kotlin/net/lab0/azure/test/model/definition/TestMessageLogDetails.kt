package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

/**
 * An abstracted reference to some other resource. This class is used to provide the build data
 * contracts with a uniform way to reference other resources in a way that provides easy traversal
 * through links.
 */
interface TestMessageLogDetails {
  /**
   * Date when the resource is created
   */
  val dateCreated: String

  /**
   * Id of the resource
   */
  val entryId: Int

  /**
   * Message of the resource
   */
  val message: String
}
