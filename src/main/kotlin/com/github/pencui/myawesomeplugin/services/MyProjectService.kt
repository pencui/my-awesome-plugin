package com.github.pencui.myawesomeplugin.services

import com.github.pencui.myawesomeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
