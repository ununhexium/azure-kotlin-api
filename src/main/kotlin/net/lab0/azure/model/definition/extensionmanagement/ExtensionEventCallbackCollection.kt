package net.lab0.azure.model.definition.extensionmanagement

/**
 * Collection of event callbacks - endpoints called when particular extension events occur.
 */
interface ExtensionEventCallbackCollection {
  val postDisable: ExtensionEventCallback

  val postEnable: ExtensionEventCallback

  val postInstall: ExtensionEventCallback

  val postUninstall: ExtensionEventCallback

  val postUpdate: ExtensionEventCallback

  val preInstall: ExtensionEventCallback

  val versionCheck: ExtensionEventCallback
}
