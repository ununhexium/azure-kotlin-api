package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.AuditAction

interface TaskGroupRevision {
  val changedBy: IdentityRef

  val changedDate: String

  val changeType: AuditAction

  val comment: String

  val fileId: Int

  val revision: Int

  val taskGroupId: String
}
