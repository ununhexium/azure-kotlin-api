package net.lab0.azure.api.workitemtrackingprocesstemplate.processes

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ProcessesApi {
  /**
   * Returns requested process template.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id The ID of the process
   */
  @GET("/{organization}/_apis/work/processadmin/processes/export/{id}")
  fun export(
    @Path("organization") organization: String,
    @Path("id") id: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Imports a process from zip file.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param ignoreWarnings Default value is false
   */
  @POST("/{organization}/_apis/work/processadmin/processes/import")
  fun import(
    @Path("organization") organization: String,
    @Query("ignoreWarnings") ignoreWarnings: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/octet-stream",
    @Body body: String
  ): Call<JsonValue>

  /**
   * Tells whether promote has completed for the specified promote job ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id The ID of the promote job operation
   */
  @GET("/{organization}/_apis/work/processadmin/processes/status/{id}")
  fun status(
    @Path("organization") organization: String,
    @Path("id") id: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
