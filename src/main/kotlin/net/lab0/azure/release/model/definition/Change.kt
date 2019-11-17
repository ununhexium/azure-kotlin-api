package net.lab0.azure.release.model.definition

import kotlin.String

/**
 * Represents a change associated with a build.
 */
interface Change {
  val author: IdentityRef

  /**
   * The type of source. "TfsVersionControl", "TfsGit", etc.
   */
  val changeType: String

  /**
   * The location of a user-friendly representation of the resource.
   */
  val displayUri: String

  /**
   * Something that identifies the change. For a commit, this would be the SHA1. For a TFVC
   * changeset, this would be the changeset id.
   */
  val id: String

  /**
   * The location of the full representation of the resource.
   */
  val location: String

  /**
   * A description of the change. This might be a commit message or changeset description.
   */
  val message: String

  val pushedBy: IdentityRef

  /**
   * A timestamp for the change.
   */
  val timestamp: String
}
