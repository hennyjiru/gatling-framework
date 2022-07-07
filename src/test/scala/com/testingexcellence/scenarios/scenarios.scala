package com.testingexcellence.scenarios

import com.testingexcellence.requests.GetTokenRequest
import io.gatling.core.Predef.scenario

object CreateUserScenario {
  val createUserScenario = scenario("Create User Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(CreateUserRequest.create_user)
}