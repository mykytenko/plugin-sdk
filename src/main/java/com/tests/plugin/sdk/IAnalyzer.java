package com.tests.plugin.sdk;

import com.tests.plugin.sdk.objects.InputData;
import com.tests.plugin.sdk.objects.InternalData;

public interface IAnalyzer {

  InternalData analyzeInputData(InputData data);

}
