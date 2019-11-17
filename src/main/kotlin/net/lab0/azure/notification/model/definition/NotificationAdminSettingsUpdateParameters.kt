package net.lab0.azure.notification.model.definition

import net.lab0.azure.notification.model.definition.enumeration.DefaultGroupDeliveryPreference

interface NotificationAdminSettingsUpdateParameters {
  val defaultGroupDeliveryPreference: DefaultGroupDeliveryPreference
}
