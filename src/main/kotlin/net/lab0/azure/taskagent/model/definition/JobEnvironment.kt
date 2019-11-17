package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.collections.List

/**
 * Represents the context of variables and vectors for a job request.
 */
interface JobEnvironment {
  val endpoints: List<ServiceEndpoint>

  val mask: List<MaskHint>

  val options: JsonObject

  val secureFiles: List<SecureFile>

  val systemConnection: ServiceEndpoint

  val variables: JsonObject
}
