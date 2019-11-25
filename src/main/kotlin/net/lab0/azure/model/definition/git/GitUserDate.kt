package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * User info and date for Git operations.
 */
interface GitUserDate {
  /**
   * Date of the Git operation.
   */
  val date: String

  /**
   * Email address of the user performing the Git operation.
   */
  val email: String

  /**
   * Url for the user's avatar.
   */
  val imageUrl: String

  /**
   * Name of the user performing the Git operation.
   */
  val name: String
}
