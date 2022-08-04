#!/usr/bin/env groovy

import org.apache.commons.lang.StringUtils

def call(String mvnaction) {
    def mavenHome = tool name: "Maven-3.8.6", type: "maven"
    def mavenCMD = "${mavenHome}/bin/mvn"
    sh "${mavenCMD} clean package"
    
}
