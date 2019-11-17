package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface AfnStrip {
  /**
   * Auxiliary Url to be consumed by MTM
   */
  val auxiliaryUrl: String

  /**
   * Creation date of the AfnStrip
   */
  val creationDate: String

  /**
   * File name of the attachment created
   */
  val fileName: String

  /**
   * ID of AfnStrip. This is same as the attachment ID.
   */
  val id: Int

  /**
   * Project identifier which contains AfnStrip
   */
  val project: String

  /**
   * Service in which this attachment is stored in
   */
  val storedIn: String

  /**
   * Afn strip stream.
   */
  val stream: String

  /**
   * ID of the testcase.
   */
  val testCaseId: Int

  /**
   * Backing test result id.
   */
  val testResultId: Int

  /**
   * Backing test run id.
   */
  val testRunId: Int

  /**
   * Byte stream (uncompressed) length of Afn strip.
   */
  val unCompressedStreamLength: Int

  /**
   * Url of the attachment created.
   */
  val url: String
}
