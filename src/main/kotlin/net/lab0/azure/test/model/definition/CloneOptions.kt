package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String

interface CloneOptions {
  /**
   * If set to true requirements will be cloned
   */
  val cloneRequirements: Boolean

  /**
   * copy all suites from a source plan
   */
  val copyAllSuites: Boolean

  /**
   * copy ancestor hieracrchy
   */
  val copyAncestorHierarchy: Boolean

  /**
   * Name of the workitem type of the clone
   */
  val destinationWorkItemType: String

  /**
   * Key value pairs where the key value is overridden by the value.
   */
  val overrideParameters: JsonObject

  /**
   * Comment on the link that will link the new clone  test case to the original Set null for no
   * comment
   */
  val relatedLinkComment: String
}
