package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

/**
 * Test attachment information in a test iteration.
 */
interface TestCaseResultAttachmentModel {
  /**
   * Path identifier test step in test case workitem.
   */
  val actionPath: String

  /**
   * Attachment ID.
   */
  val id: Int

  /**
   * Iteration ID.
   */
  val iterationId: Int

  /**
   * Name of attachment.
   */
  val name: String

  /**
   * Attachment size.
   */
  val size: Int

  /**
   * Url to attachment.
   */
  val url: String
}
