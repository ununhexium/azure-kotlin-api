package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.CreateProcessRuleRequest
import net.lab0.azure.workitemtracking.model.definition.UpdateProcessRuleRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface RulesApi {
  /**
   * Returns a list of all rules in the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/rules")
  fun list(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Adds a rule to work item type in the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/rules")
  fun add(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: CreateProcessRuleRequest
  ): Call<JsonValue>

  /**
   * Returns a single rule in the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param ruleId The ID of the rule
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/rules/{ruleId}")
  fun get(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("ruleId") ruleId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Updates a rule in the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param ruleId The ID of the rule
   */
  @PUT("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/rules/{ruleId}")
  fun update(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("ruleId") ruleId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: UpdateProcessRuleRequest
  ): Call<JsonValue>

  /**
   * Removes a rule from the work item type in the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param ruleId The ID of the rule
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/rules/{ruleId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("ruleId") ruleId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
