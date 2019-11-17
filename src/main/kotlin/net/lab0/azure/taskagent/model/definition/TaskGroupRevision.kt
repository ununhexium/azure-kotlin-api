package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.AuditAction

interface TaskGroupRevision {
  val changedBy: IdentityRef

  val changedDate: String

  val changeType: AuditAction

  val comment: String

  val fileId: Int

  val revision: Int

  val taskGroupId: String
}
