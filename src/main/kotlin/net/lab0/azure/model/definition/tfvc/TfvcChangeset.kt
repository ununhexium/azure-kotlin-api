package net.lab0.azure.model.definition.tfvc

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * A collection of changes.
 */
interface TfvcChangeset : TfvcChangesetRef {
  /**
   * Changeset Account Id also known as Organization Id.
   */
  val accountId: String

  /**
   * List of associated changes.
   */
  val changes: List<TfvcChange>

  /**
   * List of Checkin Notes for the changeset.
   */
  val checkinNotes: List<CheckinNote>

  /**
   * Changeset collection Id.
   */
  val collectionId: String

  /**
   * True if more changes are available.
   */
  val hasMoreChanges: Boolean

  val policyOverride: TfvcPolicyOverrideInfo

  /**
   * Team Project Ids for the changeset.
   */
  val teamProjectIds: List<String>

  /**
   * List of work items associated with the changeset.
   */
  val workItems: List<AssociatedWorkItem>
}
