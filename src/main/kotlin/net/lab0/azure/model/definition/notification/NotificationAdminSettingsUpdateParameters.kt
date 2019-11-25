package net.lab0.azure.model.definition.notification

import net.lab0.azure.model.definition.enumeration.notification.DefaultGroupDeliveryPreference

interface NotificationAdminSettingsUpdateParameters {
  val defaultGroupDeliveryPreference: DefaultGroupDeliveryPreference
}
