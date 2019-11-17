package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject

interface TaskExecution {
  val execTask: TaskReference

  /**
   * If a task is going to run code, then this provides the type/script etc... information by
   * platform. For example, it might look like. net45: { typeName:
   * "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName:
   * "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } net20: { typeName:
   * "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName:
   * "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } java: { jar:
   * "powershelltask.tasks.automation.teamfoundation.microsoft.com", } node: { script:
   * "powershellhost.js", }
   */
  val platformInstructions: JsonObject
}
