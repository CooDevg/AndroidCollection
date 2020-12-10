package com.coodev.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class LifeCyclePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        print "Plugin name is ${LifeCyclePlugin.name}"
        def android = project.extensions.getByType(AppExtension)
        def transform = new LifeCycleTransform()
        android.registerTransform(transform)
    }
}