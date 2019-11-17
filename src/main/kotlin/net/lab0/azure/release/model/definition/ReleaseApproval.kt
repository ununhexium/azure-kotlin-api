package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.ApprovalStatus
import net.lab0.azure.release.model.definition.enumeration.ApprovalType

interface ReleaseApproval {
  /**
   * Gets or sets the type of approval.
   */
  val approvalType: ApprovalType

  val approvedBy: IdentityRef

  val approver: IdentityRef

  /**
   * Gets or sets attempt which specifies as which deployment attempt it belongs.
   */
  val attempt: Int

  /**
   * Gets or sets comments for approval.
   */
  val comments: String

  /**
   * Gets date on which it got created.
   */
  val createdOn: String

  /**
   * Gets history which specifies all approvals associated with this approval.
   */
  val history: List<ReleaseApprovalHistory>

  /**
   * Gets the unique identifier of this field.
   */
  val id: Int

  /**
   * Gets or sets as approval is automated or not.
   */
  val isAutomated: Boolean

  val isNotificationOn: Boolean

  /**
   * Gets date on which it got modified.
   */
  val modifiedOn: String

  /**
   * Gets or sets rank which specifies the order of the approval. e.g. Same rank denotes parallel
   * approval.
   */
  val rank: Int

  val release: ReleaseShallowReference

  val releaseDefinition: ReleaseDefinitionShallowReference

  val releaseEnvironment: ReleaseEnvironmentShallowReference

  /**
   * Gets the revision number.
   */
  val revision: Int

  /**
   * Gets or sets the status of the approval.
   */
  val status: ApprovalStatus

  val trialNumber: Int

  /**
   * Gets url to access the approval.
   */
  val url: String
}
