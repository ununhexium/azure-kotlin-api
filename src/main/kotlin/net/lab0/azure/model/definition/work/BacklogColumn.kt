package net.lab0.azure.model.definition.work

import kotlin.Int

interface BacklogColumn {
  val columnFieldReference: WorkItemFieldReference

  val width: Int
}
