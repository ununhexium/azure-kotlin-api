package net.lab0.azure.model.definition.enumeration.serviceendpoint

import com.squareup.moshi.Json

/**
 * Mode in which the value of this input should be entered
 */
enum class InputMode {
  /**
   * This input should not be shown in the UI
   */
  @Json(name = "none")
  NONE,

  /**
   * An input text box should be shown
   */
  @Json(name = "textBox")
  TEXT_BOX,

  /**
   * An password input box should be shown
   */
  @Json(name = "passwordBox")
  PASSWORD_BOX,

  /**
   * A select/combo control should be shown
   */
  @Json(name = "combo")
  COMBO,

  /**
   * Radio buttons should be shown
   */
  @Json(name = "radioButtons")
  RADIO_BUTTONS,

  /**
   * Checkbox should be shown(for true/false values)
   */
  @Json(name = "checkBox")
  CHECK_BOX,

  /**
   * A multi-line text area should be shown
   */
  @Json(name = "textArea")
  TEXT_AREA
}
