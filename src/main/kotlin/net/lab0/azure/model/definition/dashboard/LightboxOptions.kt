package net.lab0.azure.model.definition.dashboard

import kotlin.Boolean
import kotlin.Int

/**
 * Lightbox configuration
 */
interface LightboxOptions {
  /**
   * Height of desired lightbox, in pixels
   */
  val height: Int

  /**
   * True to allow lightbox resizing, false to disallow lightbox resizing, defaults to false.
   */
  val resizable: Boolean

  /**
   * Width of desired lightbox, in pixels
   */
  val width: Int
}
