import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven

fun RepositoryHandler.tencentCloud() {
    maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
}