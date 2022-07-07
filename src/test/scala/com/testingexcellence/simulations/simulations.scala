package com.testingexcellence.simulations

import com.testingexcellence.scenarios.CreateUserScenario
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import com.testingexcellence.config.Config._

class CreateUserSimulation extends Simulation {
  private val createUserExec = CreateUserScenario.createUserScenario
    .inject(atOnceUsers(users))

  setUp(createUserExec)
}