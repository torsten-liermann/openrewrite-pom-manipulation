The example is ultimately intended to demonstrate the usefulness of OpenRewrite in migrating from EAP 7.4 to EAP 8.0 with regard to the necessary adjustments to dependencies in Maven projects. What changes in this regard is listed here: [https://docs.redhat.com/en/documentation/red_hat_jboss_enterprise_application_platform/8.0/html/migration_guide/migrate-a-jboss-eap-application-s-maven-project-to-jboss-eap-8-0_default](https://docs.redhat.com/en/documentation/red_hat_jboss_enterprise_application_platform/8.0/html/migration_guide/migrate-a-jboss-eap-application-s-maven-project-to-jboss-eap-8-0_default)

The pom.xml only contains the dependency management because even that isn’t being migrated. Corresponding hints can be found in the OpenRewrite Slack channel “questions”. Maven is called from the command line as follows:  
`mvnw org.openrewrite.maven:rewrite-maven-plugin:5.46.2:run -Drewrite.configLocation=./rewrite.yml -Drewrite.activeRecipes=MigrateEAPDependencies`

pom-full.xml also contains the dependencies mentioned in the Red Hat documentation. However, as long as the dependency management is not properly migrated, the dependencies will not function correctly.


