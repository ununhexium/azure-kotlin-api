package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.TestLogScope
import net.lab0.azure.model.definition.enumeration.test.TestLogType

interface TestLogReference {
  /**
   * BuildId for test log, if context is build
   */
  val buildId: Int

  /**
   * FileName for log file
   */
  val filePath: String

  /**
   * Resultid for test log, if context is run and log is related to result
   */
  val resultId: Int

  /**
   * runid for test log, if context is run
   */
  val runId: Int

  /**
   * Test Log Reference object
   */
  val scope: TestLogScope

  /**
   * SubResultid for test log, if context is run and log is related to subresult
   */
  val subResultId: Int

  /**
   * Log Type
   */
  val type: TestLogType
}
