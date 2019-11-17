package net.lab0.azure.workitemtrackingprocesstemplate.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Describes result of a check template existence request.
 */
interface CheckTemplateExistenceResult {
  /**
   * Indicates whether a template exists.
   */
  val doesTemplateExist: Boolean

  /**
   * The name of the existing template.
   */
  val existingTemplateName: String

  /**
   * The existing template type identifier.
   */
  val existingTemplateTypeId: String

  /**
   * The name of the requested template.
   */
  val requestedTemplateName: String
}
