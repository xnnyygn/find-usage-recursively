package com.github.xnnyygn.findusagerecursively.services

import com.intellij.openapi.project.Project
import com.github.xnnyygn.findusagerecursively.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
