// Another way is to use Spring annotations (e.g. custom annotation).
// In this case Spring loads all implementations that are annotated as @ReportServicePlugin.
//
// Every plugin needs to have a dependency to current sdk (no need for any additional Spring dependency),
// every implementation needs to be annotated as @ReportServicePlugin.
//
//
//
// package com.tests.plugin.sdk.annotations;
//
//import org.springframework.stereotype.Component;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Target({ ElementType.TYPE })
//@Retention(RetentionPolicy.RUNTIME)
//@Component
//public @interface ReportServicePlugin {
//}
