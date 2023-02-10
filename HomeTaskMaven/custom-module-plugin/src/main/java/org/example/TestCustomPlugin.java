package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "custom")
public class TestCustomPlugin extends AbstractMojo {

    @Parameter(defaultValue = "Check your message in the TestCustomPlugin")
    private String message;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(message);
    }
}