package net.lab0.azure.api.test.suiteentry

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.test.SuiteEntryUpdateModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface SuiteEntryApi {
  /**
   * Get a list of test suite entries in the test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param suiteId Id of the parent suite.
   */
  @GET("/{organization}/{project}/_apis/test/suiteentry/{suiteId}")
  fun getSuiteEntries(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Reorder test suite entries in the test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param suiteId Id of the parent test suite.
   */
  @PATCH("/{organization}/{project}/_apis/test/suiteentry/{suiteId}")
  fun reorderSuiteEntries(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<SuiteEntryUpdateModel>
  ): Call<JsonValue>
}
