package net.lab0.azure.work.model.definition

import kotlin.String

/**
 * An abstracted reference to a field
 */
interface FieldReference {
  /**
   * fieldRefName for the field
   */
  val referenceName: String

  /**
   * Full http link to more information about the field
   */
  val url: String
}
