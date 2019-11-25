package net.lab0.azure.model.definition.release

import kotlin.String

interface PackageTrigger : ReleaseTriggerBase {
  val alias: String
}
