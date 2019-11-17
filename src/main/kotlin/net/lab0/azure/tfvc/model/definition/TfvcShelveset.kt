package net.lab0.azure.tfvc.model.definition

import kotlin.collections.List

/**
 * Metadata for a shelveset.
 */
interface TfvcShelveset : TfvcShelvesetRef {
  /**
   * List of changes.
   */
  val changes: List<TfvcChange>

  /**
   * List of checkin notes.
   */
  val notes: List<CheckinNote>

  val policyOverride: TfvcPolicyOverrideInfo

  /**
   * List of associated workitems.
   */
  val workItems: List<AssociatedWorkItem>
}
