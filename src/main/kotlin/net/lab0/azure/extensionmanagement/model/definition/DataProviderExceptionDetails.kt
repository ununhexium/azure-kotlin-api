package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

interface DataProviderExceptionDetails {
  /**
   * The type of the exception that was thrown.
   */
  val exceptionType: String

  /**
   * Message that is associated with the exception.
   */
  val message: String

  /**
   * The StackTrace from the exception turned into a string.
   */
  val stackTrace: String
}
