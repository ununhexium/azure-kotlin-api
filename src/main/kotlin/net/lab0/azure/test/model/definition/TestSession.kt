package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.TestSessionSource
import net.lab0.azure.test.model.definition.enumeration.TestSessionState

/**
 * Test Session
 */
interface TestSession {
  val area: ShallowReference

  /**
   * Comments in the test session
   */
  val comment: String

  /**
   * Duration of the session
   */
  val endDate: String

  /**
   * Id of the test session
   */
  val id: Int

  val lastUpdatedBy: IdentityRef

  /**
   * Last updated date
   */
  val lastUpdatedDate: String

  val owner: IdentityRef

  val project: ShallowReference

  val propertyBag: PropertyBag

  /**
   * Revision of the test session
   */
  val revision: Int

  /**
   * Source of the test session
   */
  val source: TestSessionSource

  /**
   * Start date
   */
  val startDate: String

  /**
   * State of the test session
   */
  val state: TestSessionState

  /**
   * Title of the test session
   */
  val title: String

  /**
   * Url of Test Session Resource
   */
  val url: String
}
