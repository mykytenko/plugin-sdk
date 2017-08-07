package com.tests.plugin.sdk;


import com.tests.plugin.sdk.objects.InternalData;
import com.tests.plugin.sdk.objects.ReportData;

public interface IReporter {

  ReportData getReportingData(InternalData inputData);

}
