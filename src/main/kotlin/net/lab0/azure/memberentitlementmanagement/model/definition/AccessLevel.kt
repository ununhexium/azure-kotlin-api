package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.String
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.AccountLicenseType
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.AccountUserStatus
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.AssignmentSource
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.LicensingSource
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.MsdnLicenseType

interface AccessLevel {
  /**
   * Type of Account License (e.g. Express, Stakeholder etc.)
   */
  val accountLicenseType: AccountLicenseType

  /**
   * Assignment Source of the License (e.g. Group, Unknown etc.
   */
  val assignmentSource: AssignmentSource

  /**
   * Display name of the License
   */
  val licenseDisplayName: String

  /**
   * Licensing Source (e.g. Account. MSDN etc.)
   */
  val licensingSource: LicensingSource

  /**
   * Type of MSDN License (e.g. Visual Studio Professional, Visual Studio Enterprise etc.)
   */
  val msdnLicenseType: MsdnLicenseType

  /**
   * User status in the account
   */
  val status: AccountUserStatus

  /**
   * Status message.
   */
  val statusMessage: String
}
