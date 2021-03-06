package com.kzonix.spark.conf;

import com.google.inject.Provider;
import com.typesafe.config.Config;

public class ApplicationConfigProvider implements Provider<Config> {

  @Override
  public Config get() {
    return ApplicationConfigLoader.load();
  }
}

