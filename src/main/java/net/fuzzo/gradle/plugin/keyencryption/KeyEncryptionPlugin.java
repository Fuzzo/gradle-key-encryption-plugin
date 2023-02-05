package net.fuzzo.gradle.plugin.keyencryption;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class KeyEncryptionPlugin implements Plugin<Project> {
	@Override
    public void apply(Project project) {
        project.task("hello")
          .doLast(task -> System.out.println("Hello Fuzzo!"));
    }
}
