package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "ejb-maven-plugin")
public class MyMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException {
        // Hier erfolgt keine Aktion – das Mojo ist absichtlich leer.
    }
}
