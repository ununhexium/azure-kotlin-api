package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TestVariable {
  /**
   * Description of the test variable
   */
  val description: String

  /**
   * Id of the test variable
   */
  val id: Int

  /**
   * Name of the test variable
   */
  val name: String

  val project: ShallowReference

  /**
   * Revision
   */
  val revision: Int

  /**
   * Url of the test variable
   */
  val url: String

  /**
   * List of allowed values
   */
  val values: List<String>
}
