package net.lab0.azure.model.definition.test

import kotlin.String

/**
 * Failing since information of a test result.
 */
interface FailingSince {
  val build: BuildReference

  /**
   * Time since failing.
   */
  val date: String

  val release: ReleaseReference
}
