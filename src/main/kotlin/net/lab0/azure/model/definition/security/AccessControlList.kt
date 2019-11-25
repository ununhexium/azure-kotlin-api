package net.lab0.azure.model.definition.security

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String

/**
 * The AccessControlList class is meant to associate a set of AccessControlEntries with a security
 * token and its inheritance settings.
 */
interface AccessControlList {
  /**
   * Storage of permissions keyed on the identity the permission is for.
   */
  val acesDictionary: JsonObject

  /**
   * True if this ACL holds ACEs that have extended information.
   */
  val includeExtendedInfo: Boolean

  /**
   * True if the given token inherits permissions from parents.
   */
  val inheritPermissions: Boolean

  /**
   * The token that this AccessControlList is for.
   */
  val token: String
}
