package net.lab0.azure.model.definition.work

import kotlin.Boolean
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.work.IdentityDisplayFormat

/**
 * Card settings, such as fields and rules
 */
interface CardFieldSettings {
  /**
   * A collection of field information of additional fields on cards. The index in the collection
   * signifies the order of the field among the additional fields. Currently unused. Should be used
   * with User Story 691539: Card setting: additional fields
   */
  val additionalFields: List<FieldInfo>

  /**
   * Display format for the assigned to field
   */
  val assignedToDisplayFormat: IdentityDisplayFormat

  /**
   * A collection of field information of rendered core fields on cards.
   */
  val coreFields: List<FieldInfo>

  /**
   * Flag indicating whether to show assigned to field on cards. When true, AssignedToDisplayFormat
   * will determine how the field will be displayed
   */
  val showAssignedTo: Boolean

  /**
   * Flag indicating whether to show empty fields on cards
   */
  val showEmptyFields: Boolean

  /**
   * Flag indicating whether to show ID on cards
   */
  val showId: Boolean

  /**
   * Flag indicating whether to show state field on cards
   */
  val showState: Boolean

  /**
   * Flag indicating whether to show tags on cards
   */
  val showTags: Boolean
}
