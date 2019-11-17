package net.lab0.azure.release.model.definition

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
