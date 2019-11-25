package net.lab0.azure.model.definition.release

import kotlin.Boolean

interface ReleaseCondition : Condition {
  val result: Boolean
}
