package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface ResourceLimit {
  val failedToReachAllProviders: Boolean

  val hostId: String

  val isHosted: Boolean

  val isPremium: Boolean

  val parallelismTag: String

  val resourceLimitsData: JsonObject

  val totalCount: Int

  val totalMinutes: Int
}
