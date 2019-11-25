package net.lab0.azure.model.definition.tfvc

import kotlin.Int
import kotlin.String

/**
 * Metadata for a Label.
 */
interface TfvcLabelRef {
  val _links: ReferenceLinks

  /**
   * Label description.
   */
  val description: String

  /**
   * Label Id.
   */
  val id: Int

  /**
   * Label scope.
   */
  val labelScope: String

  /**
   * Last modified datetime for the label.
   */
  val modifiedDate: String

  /**
   * Label name.
   */
  val name: String

  val owner: IdentityRef

  /**
   * Label Url.
   */
  val url: String
}
