package net.lab0.azure.work.model.definition

import kotlin.Int

interface BacklogColumn {
  val columnFieldReference: WorkItemFieldReference

  val width: Int
}
