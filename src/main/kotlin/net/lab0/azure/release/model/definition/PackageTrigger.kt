package net.lab0.azure.release.model.definition

import kotlin.String

interface PackageTrigger : ReleaseTriggerBase {
  val alias: String
}
