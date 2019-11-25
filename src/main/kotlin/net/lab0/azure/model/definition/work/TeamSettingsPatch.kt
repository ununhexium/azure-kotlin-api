package net.lab0.azure.model.definition.work

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.work.BugsBehavior

/**
 * Data contract for what we expect to receive when PATCH
 */
interface TeamSettingsPatch {
  val backlogIteration: String

  val backlogVisibilities: JsonObject

  val bugsBehavior: BugsBehavior

  val defaultIteration: String

  val defaultIterationMacro: String

  val workingDays: List<JsonObject>
}
