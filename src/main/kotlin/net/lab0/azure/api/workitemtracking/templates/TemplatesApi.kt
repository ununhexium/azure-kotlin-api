package net.lab0.azure.api.workitemtracking.templates

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.workitemtracking.WorkItemTemplate
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface TemplatesApi {
  /**
   * Gets template
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param workitemtypename Optional, When specified returns templates for given Work item type.
   */
  @GET("/{organization}/{project}/{team}/_apis/wit/templates")
  fun getTemplates(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("workitemtypename") workitemtypename: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Creates a template
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @POST("/{organization}/{project}/{team}/_apis/wit/templates")
  fun createTemplate(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WorkItemTemplate
  ): Call<JsonValue>

  /**
   * Gets the template with specified id
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param templateId Template Id
   */
  @GET("/{organization}/{project}/{team}/_apis/wit/templates/{templateId}")
  fun getTemplate(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Path("templateId") templateId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Replace template contents
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param templateId Template id
   */
  @PUT("/{organization}/{project}/{team}/_apis/wit/templates/{templateId}")
  fun replaceTemplate(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Path("templateId") templateId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WorkItemTemplate
  ): Call<JsonValue>

  /**
   * Deletes the template with given id
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param templateId Template id
   */
  @DELETE("/{organization}/{project}/{team}/_apis/wit/templates/{templateId}")
  fun deleteTemplate(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Path("templateId") templateId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
