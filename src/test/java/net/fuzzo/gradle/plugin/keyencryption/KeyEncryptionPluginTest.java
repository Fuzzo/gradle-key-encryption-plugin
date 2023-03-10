package net.fuzzo.gradle.plugin.keyencryption;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KeyEncryptionPluginTest {
    @Test void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("gradle-key-encryption-plugin");

        // Verify the result
        assertNotNull(project.getTasks().findByName("hello"));
    }
}
