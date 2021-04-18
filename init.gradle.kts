import org.gradle.api.internal.GradleInternal
import org.gradle.api.internal.initialization.DefaultClassLoaderScope
import org.gradle.internal.classpath.ClassPath
import org.gradle.internal.classpath.DefaultClassPath

val depFile = file("repos-1.0-SNAPSHOT.jar")

beforeProject {
    println("root: $rootProject, this: $this")
    if (this == rootProject){
        println("inject classpath")
        val gradleInternal = gradle as GradleInternal
        val field = DefaultClassLoaderScope::class.java.getDeclaredField("export")
        field.isAccessible = true
        val oldClassPath = field.get(gradleInternal.baseProjectClassLoaderScope()) as ClassPath
        field.set(gradleInternal.baseProjectClassLoaderScope(), oldClassPath + DefaultClassPath.of(depFile))
    }
}