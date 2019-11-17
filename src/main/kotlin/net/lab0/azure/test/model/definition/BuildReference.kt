package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

/**
 * Reference to a build.
 */
interface BuildReference {
  /**
   * Branch name.
   */
  val branchName: String

  /**
   * Build system.
   */
  val buildSystem: String

  /**
   * Build Definition ID.
   */
  val definitionId: Int

  /**
   * Build ID.
   */
  val id: Int

  /**
   * Build Number.
   */
  val number: String

  /**
   * Repository ID.
   */
  val repositoryId: String

  /**
   * Build URI.
   */
  val uri: String
}
