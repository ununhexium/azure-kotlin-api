package net.lab0.azure.model.definition.servicehooks

import kotlin.String

/**
 * Provides different formats of an event message
 */
interface FormattedEventMessage {
  /**
   * Gets or sets the html format of the message
   */
  val html: String

  /**
   * Gets or sets the markdown format of the message
   */
  val markdown: String

  /**
   * Gets or sets the raw text of the message
   */
  val text: String
}
