package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class ServiceGroupType {
  @Json(name = "undefined")
  UNDEFINED,

  /**
   * Unknown service group type
   */
  @Json(name = "generic")
  GENERIC,

  /**
   * Virtual machine service group type
   */
  @Json(name = "virtualMachine")
  VIRTUAL_MACHINE,

  /**
   * Kubernetes service group type
   */
  @Json(name = "kubernetes")
  KUBERNETES
}
