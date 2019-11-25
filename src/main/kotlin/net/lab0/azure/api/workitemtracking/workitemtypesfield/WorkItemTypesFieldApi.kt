package net.lab0.azure.api.workitemtracking.workitemtypesfield

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.WorkItemTypeFieldsExpandLevel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemTypesFieldApi {
  /**
   * Get a list of fields for a work item type with detailed references.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param type Work item type.
   * @param expand Expand level for the API response. Properties: to include allowedvalues, default
   * value, isRequired etc. as a part of response; None: to skip these properties.
   */
  @GET("/{organization}/{project}/_apis/wit/workitemtypes/{type}/fields")
  fun getWorkItemTypeFieldsWithReferences(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("type") type: String,
    @Query("${'$'}expand") expand: WorkItemTypeFieldsExpandLevel? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a field for a work item type with detailed references.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param type Work item type.
   * @param expand Expand level for the API response. Properties: to include allowedvalues, default
   * value, isRequired etc. as a part of response; None: to skip these properties.
   */
  @GET("/{organization}/{project}/_apis/wit/workitemtypes/{type}/fields/{field}")
  fun getWorkItemTypeFieldWithReferences(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("type") type: String,
    @Path("field") field: String,
    @Query("${'$'}expand") expand: WorkItemTypeFieldsExpandLevel? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
