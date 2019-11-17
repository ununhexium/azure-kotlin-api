package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.memberentitlementmanagement.model.definition.enumeration.MinimumRequiredServiceLevel

interface ExtensionSummaryData : SummaryData {
  /**
   * Count of Extension Licenses assigned to users through msdn.
   */
  val assignedThroughSubscription: Int

  /**
   * Gallery Id of the Extension
   */
  val extensionId: String

  /**
   * Friendly name of this extension
   */
  val extensionName: String

  /**
   * Whether its a Trial Version.
   */
  val isTrialVersion: Boolean

  /**
   * Minimum License Required for the Extension.
   */
  val minimumLicenseRequired: MinimumRequiredServiceLevel

  /**
   * Days remaining for the Trial to expire.
   */
  val remainingTrialDays: Int

  /**
   * Date on which the Trial expires.
   */
  val trialExpiryDate: String
}
