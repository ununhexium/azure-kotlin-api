package net.lab0.azure.dashboard.model.definition

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
