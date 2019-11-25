package net.lab0.azure.model.definition.symbol

import kotlin.String
import net.lab0.azure.model.definition.enumeration.symbol.RequestStatus

/**
 * Symbol request.
 */
interface Request : ResourceBase {
  /**
   * An optional human-facing description.
   */
  val description: String

  /**
   * An optional expiration date for the request. The request will become inaccessible and get
   * deleted after the date, regardless of its status.  On an HTTP POST, if expiration date is
   * null/missing, the server will assign a default expiration data (30 days unless overwridden in the
   * registry at the account level). On PATCH, if expiration date is null/missing, the behavior is to
   * not change whatever the request's current expiration date is.
   */
  val expirationDate: String

  /**
   * A human-facing name for the request. Required on POST, ignored on PATCH.
   */
  val name: String

  /**
   * The status for this request.
   */
  val status: RequestStatus
}
