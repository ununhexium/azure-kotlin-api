package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface ReleaseRevision {
  val changedBy: IdentityRef

  val changedDate: String

  val changeDetails: String

  val changeType: String

  val comment: String

  val definitionSnapshotRevision: Int

  val releaseId: Int
}
