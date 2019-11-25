package net.lab0.azure.model.definition.core

import kotlin.String

/**
 * The Team Context for an operation.
 */
interface TeamContext {
  /**
   * The team project Id or name.  Ignored if ProjectId is set.
   */
  val project: String

  /**
   * The Team Project ID.  Required if Project is not set.
   */
  val projectId: String

  /**
   * The Team Id or name.  Ignored if TeamId is set.
   */
  val team: String

  /**
   * The Team Id
   */
  val teamId: String
}
