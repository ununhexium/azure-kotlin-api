package net.lab0.azure.model.definition.graph

import kotlin.String

/**
 * Top-level graph entity
 */
interface GraphSubject : GraphSubjectBase {
  /**
   * [Internal Use Only] The legacy descriptor is here in case you need to access old version IMS
   * using identity descriptor.
   */
  val legacyDescriptor: String

  /**
   * The type of source provider for the origin identifier (ex:AD, AAD, MSA)
   */
  val origin: String

  /**
   * The unique identifier from the system of origin. Typically a sid, object id or Guid. Linking
   * and unlinking operations can cause this value to change for a user because the user is not backed
   * by a different provider and has a different unique id in the new provider.
   */
  val originId: String

  /**
   * This field identifies the type of the graph subject (ex: Group, Scope, User).
   */
  val subjectKind: String
}
