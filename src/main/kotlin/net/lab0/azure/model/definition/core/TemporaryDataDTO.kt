package net.lab0.azure.model.definition.core

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

/**
 * A data transfer object that stores the metadata associated with the temporary data.
 */
interface TemporaryDataDTO {
  val expirationSeconds: Int

  val origin: String

  val value: JsonObject
}
