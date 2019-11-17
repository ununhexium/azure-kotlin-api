package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.Wiql
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HEAD
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WiqlApi {
  /**
   * Gets the results of the query given its WIQL.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param timePrecision Whether or not to use time precision.
   * @param top The max number of results to return.
   */
  @POST("/{organization}/{project}/{team}/_apis/wit/wiql")
  fun queryByWiql(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("timePrecision") timePrecision: Boolean,
    @Query("${'$'}top") top: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: Wiql
  ): Call<JsonValue>

  /**
   * Gets the results of the query given the query ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id The query ID.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param timePrecision Whether or not to use time precision.
   * @param top The max number of results to return.
   */
  @GET("/{organization}/{project}/{team}/_apis/wit/wiql/{id}")
  fun queryById(
    @Path("organization") organization: String,
    @Path("id") id: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("timePrecision") timePrecision: Boolean,
    @Query("${'$'}top") top: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Gets the results of the query given the query ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id The query ID.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param timePrecision Whether or not to use time precision.
   * @param top The max number of results to return.
   */
  @HEAD("/{organization}/{project}/{team}/_apis/wit/wiql/{id}")
  fun get(
    @Path("organization") organization: String,
    @Path("id") id: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("timePrecision") timePrecision: Boolean,
    @Query("${'$'}top") top: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
