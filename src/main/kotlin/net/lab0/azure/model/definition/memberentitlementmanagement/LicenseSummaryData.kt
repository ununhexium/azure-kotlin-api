package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.AccountLicenseType
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.LicensingSource
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.MsdnLicenseType

interface LicenseSummaryData : SummaryData {
  /**
   * Type of Account License.
   */
  val accountLicenseType: AccountLicenseType

  /**
   * Count of Disabled Licenses.
   */
  val disabled: Int

  /**
   * Designates if this license quantity can be changed through purchase
   */
  val isPurchasable: Boolean

  /**
   * Name of the License.
   */
  val licenseName: String

  /**
   * Type of MSDN License.
   */
  val msdnLicenseType: MsdnLicenseType

  /**
   * Specifies the date when billing will charge for paid licenses
   */
  val nextBillingDate: String

  /**
   * Source of the License.
   */
  val source: LicensingSource

  /**
   * Total license count after next billing cycle
   */
  val totalAfterNextBillingDate: Int
}
