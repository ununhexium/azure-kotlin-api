package net.lab0.azure.notification.model.definition

import net.lab0.azure.notification.model.definition.enumeration.DefaultGroupDeliveryPreference

interface NotificationAdminSettings {
  /**
   * The default group delivery preference for groups in this collection
   */
  val defaultGroupDeliveryPreference: DefaultGroupDeliveryPreference
}
