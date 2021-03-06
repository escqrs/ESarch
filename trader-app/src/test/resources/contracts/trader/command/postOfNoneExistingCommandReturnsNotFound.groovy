package contracts.trader.command

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpStatus

Contract.make {
  request {
    method 'POST'
    url "/command/SomeNoneExistingCommand"
    body("{}")
    headers {
      contentType applicationJson()
    }
  }
  response {
    status HttpStatus.NOT_FOUND.value()
    async()
  }
}
