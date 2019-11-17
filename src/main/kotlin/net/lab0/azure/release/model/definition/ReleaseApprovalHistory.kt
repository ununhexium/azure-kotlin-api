package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String

interface ReleaseApprovalHistory {
  val approver: IdentityRef

  val changedBy: IdentityRef

  val comments: String

  val createdOn: String

  val modifiedOn: String

  val revision: Int
}
