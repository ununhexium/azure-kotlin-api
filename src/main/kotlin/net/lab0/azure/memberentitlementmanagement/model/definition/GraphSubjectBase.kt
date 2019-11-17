package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.String

interface GraphSubjectBase {
  val _links: ReferenceLinks

  /**
   * The descriptor is the primary way to reference the graph subject while the system is running.
   * This field will uniquely identify the same graph subject across both Accounts and Organizations.
   */
  val descriptor: String

  /**
   * This is the non-unique display name of the graph subject. To change this field, you must alter
   * its value in the source provider.
   */
  val displayName: String

  /**
   * This url is the full route to the source resource of this graph subject.
   */
  val url: String
}
