package net.lab0.azure.model.definition.accounts

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.accounts.AccountStatus
import net.lab0.azure.model.definition.enumeration.accounts.AccountType

interface Account {
  /**
   * Identifier for an Account
   */
  val accountId: String

  /**
   * Name for an account
   */
  val accountName: String

  /**
   * Owner of account
   */
  val accountOwner: String

  /**
   * Current account status
   */
  val accountStatus: AccountStatus

  /**
   * Type of account: Personal, Organization
   */
  val accountType: AccountType

  /**
   * Uri for an account
   */
  val accountUri: String

  /**
   * Who created the account
   */
  val createdBy: String

  /**
   * Date account was created
   */
  val createdDate: String

  val hasMoved: Boolean

  /**
   * Identity of last person to update the account
   */
  val lastUpdatedBy: String

  /**
   * Date account was last updated
   */
  val lastUpdatedDate: String

  /**
   * Namespace for an account
   */
  val namespaceId: String

  val newCollectionId: String

  /**
   * Organization that created the account
   */
  val organizationName: String

  val properties: PropertiesCollection

  /**
   * Reason for current status
   */
  val statusReason: String
}
