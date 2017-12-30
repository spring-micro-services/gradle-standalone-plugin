package com.tvajjala.plugin

import com.tvajjala.BuildNumberExtension
import com.tvajjala.task.BuildNumberTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class BuildNumberPlugin implements Plugin<Project> {


    @Override
    void apply(Project project) {

        project.extensions.create('buildNumber', BuildNumberExtension)

        Task buildnumberTask = project.task('buildnumbertask', type: BuildNumberTask)

        project.tasks['jar'].dependsOn buildnumberTask
    }

}
