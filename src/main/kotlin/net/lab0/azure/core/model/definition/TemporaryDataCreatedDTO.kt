package net.lab0.azure.core.model.definition

import kotlin.String

/**
 * A data transfer object that stores the metadata associated with the creation of temporary data.
 */
interface TemporaryDataCreatedDTO : TemporaryDataDTO {
  val expirationDate: String

  val id: String

  val url: String
}
