package com.github.takamuffin.ideapluginsettingsmanagemen.services

import com.intellij.openapi.project.Project
import com.github.takamuffin.ideapluginsettingsmanagemen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
