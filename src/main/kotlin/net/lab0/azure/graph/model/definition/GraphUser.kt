package net.lab0.azure.graph.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Graph user entity
 */
interface GraphUser : GraphMember {
  val isDeletedInOrigin: Boolean

  val metadataUpdateDate: String

  /**
   * The meta type of the user in the origin, such as "member", "guest", etc. See UserMetaType for
   * the set of possible values.
   */
  val metaType: String
}
