package net.lab0.azure.model.definition.notification

import net.lab0.azure.model.definition.enumeration.notification.DefaultGroupDeliveryPreference

interface NotificationAdminSettings {
  /**
   * The default group delivery preference for groups in this collection
   */
  val defaultGroupDeliveryPreference: DefaultGroupDeliveryPreference
}
