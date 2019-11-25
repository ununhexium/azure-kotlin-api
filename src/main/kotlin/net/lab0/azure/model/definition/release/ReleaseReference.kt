package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.ReleaseReason

interface ReleaseReference {
  val _links: ReferenceLinks

  /**
   * Gets list of artifacts.
   */
  val artifacts: List<Artifact>

  val createdBy: IdentityRef

  /**
   * Gets date on which it got created.
   */
  val createdOn: String

  /**
   * Gets description.
   */
  val description: String

  /**
   * Gets the unique identifier of this field.
   */
  val id: Int

  val modifiedBy: IdentityRef

  /**
   * Gets name of release.
   */
  val name: String

  /**
   * Gets reason for release.
   */
  val reason: ReleaseReason

  val releaseDefinition: ReleaseDefinitionShallowReference
}
