import org.gradle.api.artifacts.dsl.RepositoryHandler
import java.net.URI

fun RepositoryHandler.tencentCloud() {
    maven {
        it.url = URI.create("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
}