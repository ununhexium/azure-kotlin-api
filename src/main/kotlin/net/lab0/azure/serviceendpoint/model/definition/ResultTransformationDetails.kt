package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

/**
 * Represents template to tranform the result data.
 */
interface ResultTransformationDetails {
  /**
   * Gets or sets the template for callback parameters
   */
  val callbackContextTemplate: String

  /**
   * Gets or sets the template to decide whether to callback or not
   */
  val callbackRequiredTemplate: String

  /**
   * Gets or sets the template for result transformation.
   */
  val resultTemplate: String
}
