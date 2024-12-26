The example is ultimately intended to demonstrate the usefulness of OpenRewrite in migrating from EAP 7.4 to EAP 8.0
with regard to the necessary adjustments to dependencies in Maven projects.
What changes in this regard is listed
here: [https://docs.redhat.com/en/documentation/red_hat_jboss_enterprise_application_platform/8.0/html/migration_guide/migrate-a-jboss-eap-application-s-maven-project-to-jboss-eap-8-0_default](https://docs.redhat.com/en/documentation/red_hat_jboss_enterprise_application_platform/8.0/html/migration_guide/migrate-a-jboss-eap-application-s-maven-project-to-jboss-eap-8-0_default)

This small demo served as the basis for a discussion in
the [OpenRewrite Slack workspace](https://rewriteoss.slack.com/archives/C01A843MWG5/p1733862921201659).

The pom.xml file contains all dependencies listed by Red Hat in their migration guide, valid for EAP 7.4.
The pom-eap8.xml file shows the migrated dependencies, valid for EAP 8.0. All necessary OpenRewrite rules are included
in the rewrite.yml file. rewrite-01_pro.yml
demonstrates how little the ChatGPT O1 Pro model helps in creating the required recipes. :-(

Maven is called from the command line as follows:  
`mvnw org.openrewrite.maven:rewrite-maven-plugin:LATEST:run -Drewrite.configLocation=./rewrite.yml
-Drewrite.activeRecipes=MigrateEAPDependencies
"LATEST" is currently version 5.47.0.

The `JakartaEE10` recipe has been added because running the `EAP80` recipe alone is not practical. Individual runs of
the recipes halt the OpenRewrite process because the Maven build no longer compiles after a single migration; either the
migrated dependencies do not match the Java code, or the migrated Java code does not align with the Maven dependencies.
In these cases, OpenRewrite as a Maven plugin does not produce results because the build fails before reaching the "
process-test-classes" phase of the Maven lifecycle. 


