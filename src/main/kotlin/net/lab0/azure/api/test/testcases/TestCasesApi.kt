package net.lab0.azure.api.test.testcases

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.Path
import retrofit2.http.Query

interface TestCasesApi {
  /**
   * Delete a test case.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testCaseId Id of test case to delete.
   */
  @DELETE("/{organization}/{project}/_apis/test/testcases/{testCaseId}")
  fun deleteTestCase(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testCaseId") testCaseId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
