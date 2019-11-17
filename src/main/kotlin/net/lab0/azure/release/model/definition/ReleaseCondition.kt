package net.lab0.azure.release.model.definition

import kotlin.Boolean

interface ReleaseCondition : Condition {
  val result: Boolean
}
