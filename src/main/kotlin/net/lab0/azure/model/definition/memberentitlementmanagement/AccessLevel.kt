package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.String
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.AccountLicenseType
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.AccountUserStatus
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.AssignmentSource
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.LicensingSource
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.MsdnLicenseType

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
