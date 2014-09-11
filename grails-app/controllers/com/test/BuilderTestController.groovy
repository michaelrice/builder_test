package com.test

import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse


class BuilderTestController {

    def index() {
        def foo = new RestBuilder().get("https://tomcat-demo.mrice.me/application.wadl")
        //def foo = new RestBuilder().get("https://google.com/")
        render foo.body.toString()
    }
}
