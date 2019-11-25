package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String

interface ArtifactTriggerConfiguration {
  val isTriggerSupported: Boolean

  val isTriggerSupportedOnlyInHosted: Boolean

  val isWebhookSupportedAtServerLevel: Boolean

  val payloadHashHeaderName: String

  val resources: JsonObject

  val webhookPayloadMapping: JsonObject
}
