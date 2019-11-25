package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

interface TaskHubLicenseDetails {
  val enterpriseUsersCount: Int

  val failedToReachAllProviders: Boolean

  val freeHostedLicenseCount: Int

  val freeLicenseCount: Int

  val hasLicenseCountEverUpdated: Boolean

  val hostedAgentMinutesFreeCount: Int

  val hostedAgentMinutesUsedCount: Int

  val hostedLicensesArePremium: Boolean

  val marketplacePurchasedHostedLicenses: List<MarketplacePurchasedLicense>

  val msdnUsersCount: Int

  /**
   * Microsoft-hosted licenses purchased from VSTS directly.
   */
  val purchasedHostedLicenseCount: Int

  /**
   * Self-hosted licenses purchased from VSTS directly.
   */
  val purchasedLicenseCount: Int

  val totalHostedLicenseCount: Int

  val totalLicenseCount: Int

  val totalPrivateLicenseCount: Int
}
