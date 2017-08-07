package com.tests.plugin.sdk;

public interface IPlugin {

  String getPluginName();

  long getVersion();

  String getCustomerIdentifier();

  void init();

  void shutdown();

  IAnalyzer getAnalyzer();

  IReporter getReporter();

}
