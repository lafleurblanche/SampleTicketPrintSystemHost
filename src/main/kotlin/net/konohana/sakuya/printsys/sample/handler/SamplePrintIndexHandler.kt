package net.konohana.sakuya.printsys.sample.handler

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.core.io.Resource
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

/**
 * ## Indexハンドラクラス
 * * Sample(券面印刷検証用)
 */
@Component
class SamplePrintIndexHandler {
    @Value("classpath:/sample/index.html")
    private lateinit var samplePrintIndexHtml: Resource

    @Bean
    fun samplePrintIndexRoutes(): RouterFunction<ServerResponse> {
        return RouterFunctions.route(RequestPredicates.GET("/sampleprint")) { get(it) }
    }

    @Suppress("UnusedPrivateMember")
    fun get(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().contentType(MediaType.TEXT_HTML).bodyValue(samplePrintIndexHtml)
    }
}
