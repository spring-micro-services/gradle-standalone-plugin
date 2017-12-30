package com.tvajjala.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BuildNumberTask  extends DefaultTask implements AlphanumTrait{

    @TaskAction
    def generateBuildNumber() {

        String numberType = project.buildNumber.numberType
        int alphaNumLength = project.buildNumber.alphaNumLength

        def buildNumber

        if("alphanumeric".equals (numberType)) {
            buildNumber = getAlphaNumString(alphaNumLength)
        }
        else if ( "timestamp".equals (numberType) ) {
            buildNumber = System.currentTimeMillis()
        }

        project.buildNumber.value = buildNumber
    }



}
